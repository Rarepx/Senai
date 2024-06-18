package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class AlunoDao {
	private String URL = "jdbc:mysql://localhost:3306/banco_aluno";
	private String USUARIO = "root";
	private String SENHA = "aluno";
	private Connection connection;

	public void abreConexao() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (ClassNotFoundException | SQLException e) {
			throw new SQLException("Erro ao abrir a conexão com o banco de dados", e);
		}
	}

	public void fechaConexao() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Aluno buscaAlunoPorId(int idAluno) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Aluno aluno = null;

		try {
			abreConexao();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			String sql = "SELECT * FROM aluno WHERE id_aluno = ?;";
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, idAluno);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int id_aluno = resultSet.getInt("id_aluno");
				String nome = resultSet.getString("nome");
				int idade = resultSet.getInt("idade");

				aluno = new Aluno(id_aluno, nome, idade);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		fechaConexao();

		return aluno;
	}

	public int obtemMaiorIdAluno() throws SQLException {

		abreConexao();

		int id_aluno = 0;

		String sql = "SELECT MAX(id_aluno) as id_aluno FROM aluno;";
		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				id_aluno = resultSet.getInt("id_aluno");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		fechaConexao();

		return ++id_aluno;
	}

	public boolean insereAluno(Aluno aluno) {
		int linhasAfetada = 0;

		try {
			abreConexao();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String sql = "INSERT INTO aluno (id_aluno, nome, idade) VALUES (?,?,?);";

		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setInt(1, obtemMaiorIdAluno());
			preparedStatement.setString(2, aluno.getNome());
			preparedStatement.setInt(3, aluno.getIdade());

			linhasAfetada = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return linhasAfetada > 0;
	}

	public boolean atualizaAluno(Aluno aluno) {
		int linhasAfetada = 0;

		try {
			abreConexao();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String sql = "UPDATE aluno SET nome = ?, idade = ? WHERE id_aluno = ?;";

		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setString(1, aluno.getNome());
			preparedStatement.setInt(2, aluno.getIdade());
			preparedStatement.setInt(3, aluno.getId_aluno());

			linhasAfetada = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return linhasAfetada > 0;
	}

	public boolean excluiAluno(int id_aluno) {
		PreparedStatement preparedStatement = null;
		int linhasAfetadas = 0;

		try {
			abreConexao();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String sql = "DELETE FROM aluno WHERE id_aluno = ?;";

		try {
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id_aluno);

			linhasAfetadas = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return linhasAfetadas > 0;
	}

	public List<Aluno> listaAlunos() {
		List<Aluno> alunos = null;

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Aluno aluno = null;

		try {
			abreConexao();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			String sql = "SELECT * FROM aluno;";
			preparedStatement = connection.prepareStatement(sql);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				alunos = new ArrayList<>();
				
				int id_aluno = resultSet.getInt("id_aluno");
				String nome = resultSet.getString("nome");
				int idade = resultSet.getInt("idade");

				aluno = new Aluno(id_aluno, nome, idade);
				alunos.add(aluno);

				while (resultSet.next()) {
					id_aluno = resultSet.getInt("id_aluno");
					nome = resultSet.getString("nome");
					idade = resultSet.getInt("idade");

					aluno = new Aluno(id_aluno, nome, idade);
					alunos.add(aluno);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		fechaConexao();

		return alunos;
	}
}
