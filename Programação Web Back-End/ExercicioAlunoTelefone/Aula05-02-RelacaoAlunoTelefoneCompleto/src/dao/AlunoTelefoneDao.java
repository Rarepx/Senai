package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.AlunoTelefone;

public class AlunoTelefoneDao {
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
	
	public int obtemMaiorIdTelefone() throws SQLException {

		abreConexao();

		int id_telefone = 0;

		String sql = "SELECT MAX(id_telefone) as id_telefone FROM aluno_telefone;";
		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				id_telefone = resultSet.getInt("id_telefone");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		fechaConexao();

		return ++id_telefone;
	}

	public List<AlunoTelefone> buscaTelefonePorIdAluno(int idAluno) {
		List<AlunoTelefone> telefones = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			abreConexao();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			String sql = "SELECT * "
						+ "FROM aluno_telefone AS telefone "
						+ "INNER JOIN aluno AS aluno ON aluno.id_aluno = telefone.id_aluno "
						+ "WHERE telefone.id_aluno = ?;";
			
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, idAluno);
			
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				int id_aluno = resultSet.getInt("id_aluno");
				String nome = resultSet.getString("nome");
				int idade = resultSet.getInt("idade");
				Aluno aluno = new Aluno(id_aluno, nome, idade);
				
				int id_telefone = resultSet.getInt("id_telefone");
				String telefone = resultSet.getString("telefone");
				
				AlunoTelefone alunoTelefone = new AlunoTelefone(id_telefone, aluno, telefone);
				telefones.add(alunoTelefone);
				
				while (resultSet.next()) {
					id_telefone = resultSet.getInt("id_telefone");
					telefone = resultSet.getString("telefone");
					
					alunoTelefone = new AlunoTelefone(id_telefone, aluno, telefone);
					telefones.add(alunoTelefone);
				}
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		fechaConexao();
		
		return telefones;
	}
	
	public boolean insereTelefone(AlunoTelefone alunoTelefone) {
		int linhasAfetada = 0;

		try {
			abreConexao();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String sql = "INSERT INTO aluno_telefone (id_telefone, id_aluno, telefone) VALUES (?,?,?);";

		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setInt(1, obtemMaiorIdTelefone());
			preparedStatement.setInt(2, alunoTelefone.getAluno().getId_aluno());
			preparedStatement.setString(3, alunoTelefone.getTelefone());

			linhasAfetada = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return linhasAfetada > 0;
	}
}
