package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Tarefa;
import model.Tarefa.Status;

public class TarefaDAO {

	private String url = "jdbc:mysql://localhost:3306/projeto_revisao";
	private String usuario = "root";
	private String senha = "aluno";

	public void adicionaTarefa(Tarefa tarefa) {

		// Tenta estabelecer uma conexão com o banco de dados usando as informações
		// fornecidas.
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			// Cria uma String para armazenar a query que servirá para inserir dados no banco de dados
			String sql = "INSERT INTO tarefa (id_tarefa, titulo, descricao, status) VALUES (?,?,?,?);";

			// Prepara uma declaração SQL que pode ser executada com valores substituídos pelos marcadores de posição.
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// Define o primeiro valor (id_tarefa) na instrução SQL como o resultado da função 'obtemMaiorIdTarefa()'.
			preparedStatement.setInt(1, obtemMaiorIdTarefa());
			
			// Define o segundo valor (titulo) como uma combinação do título da tarefa atual e o resultado da função 'obtemMaiorIdTarefa()'.
			preparedStatement.setString(2, tarefa.getTitulo() + " - Tarefa " + obtemMaiorIdTarefa());
			
			// Define o terceiro valor (descricao) como a descrição da tarefa atual.
			preparedStatement.setString(3, tarefa.getDescricao());
			
			// Define o quarto valor (status) como o nome do status da tarefa atual (convertido de um enum para String).
			preparedStatement.setString(4, tarefa.getStatus().name());

			// Executa a instrução SQL preparada, que insere os valores na tabela 'tarefa'.
			preparedStatement.execute();

		} catch (SQLException e) {
			// Em caso de exceção (erro SQL), imprime a pilha de erros (trace) para depuração.
			e.printStackTrace();
		}
	}

	public int obtemMaiorIdTarefa() {
		// Cria uma variável int para retornar o maior id_tarefa
		int id_tarefa = 0;

		// Tenta estabelecer uma conexão com o banco de dados usando as informações
		// fornecidas.
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			// Cria uma variável do tipo String para armazenar a query a ser executada no banco de dados
			String sql = "SELECT MAX(id_tarefa) as id_tarefa FROM tarefa;";

			// Cria um objeto 'PreparedStatement' a partir da conexão estabelecida, que é
			// mais eficiente para consultas parametrizadas.
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// Executa a consulta SQL e obtém um conjunto de resultados (ResultSet).
			ResultSet resultSet = preparedStatement.executeQuery();

			// resultSet.next() verifica se existe linha a ser lida
			while (resultSet.next()) {
				// Obtém o maior id_tarefa
				id_tarefa = resultSet.getInt("id_tarefa");
			}

		} catch (SQLException e) {
			// Captura exceções do tipo SQLException que podem ocorrer durante a execução do
			// código no bloco 'try'.

			// Se ocorrer uma exceção SQL, imprime informações detalhadas sobre a exceção,
			// incluindo a mensagem de erro e a pilha de chamadas.
			e.printStackTrace();
		}

		return ++id_tarefa;
	}

	public List<Tarefa> listaTarefa() {
		List<Tarefa> listaDeTarefa = new ArrayList<>();

		// Tenta estabelecer uma conexão com o banco de dados usando as informações
		// fornecidas.
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			// Define uma string SQL que representa uma consulta de seleção (SELECT) que
			// obtém todos os registros da tabela 'tarefa'.
			String sql = "SELECT * FROM tarefa";

			// Cria um objeto 'PreparedStatement' a partir da conexão estabelecida, que é
			// mais eficiente para consultas parametrizadas.
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// Executa a consulta SQL e obtém um conjunto de resultados (ResultSet).
			ResultSet resultSet = preparedStatement.executeQuery();

			// Itera sobre o conjunto de resultados para processar cada registro retornado.
			while (resultSet.next()) {
				// obtém os valores das colunas 'nome' e 'capital' do registro atual no conjunto
				// de resultados.
				int id_tarefa = resultSet.getInt("id_tarefa");
				String titulo = resultSet.getString("titulo");
				String descricao = resultSet.getString("descricao");
				Status status = Status.valueOf(resultSet.getString("status"));

				Tarefa tarefa = new Tarefa(id_tarefa, titulo, descricao, status);

				listaDeTarefa.add(tarefa);

			}

		} catch (SQLException e) {
			// Captura exceções do tipo SQLException que podem ocorrer durante a execução do
			// código no bloco 'try'.

			// Se ocorrer uma exceção SQL, imprime informações detalhadas sobre a exceção,
			// incluindo a mensagem de erro e a pilha de chamadas.
			e.printStackTrace();
		}

		// Retorna a lista de tarefas preenchida com os dados obtidos do banco de dados.
		return listaDeTarefa;
	}

	public void excluiTarefa(int id_tarefa) {
		// Tenta estabelecer uma conexão com o banco de dados usando as informações
		// fornecidas.
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			// Define uma string SQL que representa uma consulta de seleção (SELECT) que
			// obtém todos os registros da tabela 'tarefa'.
			String sql = "DELETE FROM tarefa WHERE id_tarefa = ?;";

			// Cria um objeto 'PreparedStatement' a partir da conexão estabelecida, que é
			// mais eficiente para consultas parametrizadas.
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id_tarefa);

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// Captura exceções do tipo SQLException que podem ocorrer durante a execução do
			// código no bloco 'try'.

			// Se ocorrer uma exceção SQL, imprime informações detalhadas sobre a exceção,
			// incluindo a mensagem de erro e a pilha de chamadas.
			e.printStackTrace();
		}
	}

	public void finalizaTarefa(int id_tarefa) {
		// Tenta estabelecer uma conexão com o banco de dados usando as informações
		// fornecidas.
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			// Define uma string SQL que representa uma consulta de seleção (SELECT) que
			// obtém todos os registros da tabela 'tarefa'.
			String sql = "UPDATE tarefa SET status = 'C' WHERE id_tarefa = ?;";

			// Cria um objeto 'PreparedStatement' a partir da conexão estabelecida, que é
			// mais eficiente para consultas parametrizadas.
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id_tarefa);

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// Captura exceções do tipo SQLException que podem ocorrer durante a execução do
			// código no bloco 'try'.

			// Se ocorrer uma exceção SQL, imprime informações detalhadas sobre a exceção,
			// incluindo a mensagem de erro e a pilha de chamadas.
			e.printStackTrace();
		}
	}

	public void atualizaTarefa(int id_tarefa, String titulo, String descricao, Status status) {
		// Tenta estabelecer uma conexão com o banco de dados usando as informações
		// fornecidas.
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {

			// Define uma string SQL que representa uma consulta de seleção (SELECT) que
			// obtém todos os registros da tabela 'tarefa'.
			String sql = "UPDATE tarefa SET titulo = ?, descricao = ?, status = ? WHERE id_tarefa = ?;";

			// Cria um objeto 'PreparedStatement' a partir da conexão estabelecida, que é
			// mais eficiente para consultas parametrizadas.
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, titulo);
			preparedStatement.setString(2, descricao);
			preparedStatement.setString(3, status.name());
			preparedStatement.setInt(4, id_tarefa);

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// Captura exceções do tipo SQLException que podem ocorrer durante a execução do
			// código no bloco 'try'.

			// Se ocorrer uma exceção SQL, imprime informações detalhadas sobre a exceção,
			// incluindo a mensagem de erro e a pilha de chamadas.
			e.printStackTrace();
		}
	}
}
