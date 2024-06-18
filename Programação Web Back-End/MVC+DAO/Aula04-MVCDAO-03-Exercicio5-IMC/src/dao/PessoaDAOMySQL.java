package dao;

import model.Pessoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAOMySQL {
	private final String url = "jdbc:mysql://localhost:3306/banco_exercicio_imc";
    private final String usuario = "root";
    private final String senha = "aluno";
    private Connection conexao; // Conexão com o banco de dados

    public PessoaDAOMySQL() {
        this.conexao = abrirConexao();
    }
    
 // Método para abrir uma conexão com o banco de dados
    public Connection abrirConexao() {
        try {
            // Carrega o driver JDBC específico (substitua pelo driver do seu banco de dados)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelece a conexão com o banco de dados usando os atributos url, usuario e senha
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null; // Retorna null em caso de erro
        }
    }

    // Método para criar uma nova pessoa no banco de dados
    public void criarPessoa(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa (nome, sexo, altura, idade, peso, imc) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.setString(2, pessoa.getSexo());
            preparedStatement.setDouble(3, pessoa.getAltura());
            preparedStatement.setInt(4, pessoa.getIdade());
            preparedStatement.setDouble(5, pessoa.getPeso());
            preparedStatement.setDouble(6, pessoa.getImc());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 // Método para ler uma pessoa do banco de dados pelo nome
    public Pessoa lerPessoa(String nome) {
        String sql = "SELECT * FROM pessoa WHERE nome = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, nome);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String sexo = resultSet.getString("sexo");
                double altura = resultSet.getDouble("altura");
                int idade = resultSet.getInt("idade");
                double peso = resultSet.getDouble("peso");
                return new Pessoa(nome, sexo, altura, idade, peso);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para atualizar os dados de uma pessoa no banco de dados pelo nome
    public boolean atualizarPessoa(Pessoa pessoa) {
        String sql = "UPDATE pessoa SET sexo = ?, altura = ?, idade = ?, peso = ? WHERE nome = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, pessoa.getSexo());
            preparedStatement.setDouble(2, pessoa.getAltura());
            preparedStatement.setInt(3, pessoa.getIdade());
            preparedStatement.setDouble(4, pessoa.getPeso());
            preparedStatement.setString(5, pessoa.getNome()); // Utilizamos o nome como chave primária
            int linhasAfetadas = preparedStatement.executeUpdate();
            return linhasAfetadas > 0; // Retorna true se pelo menos uma linha foi afetada (atualização bem-sucedida)
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para excluir uma pessoa do banco de dados pelo nome
    public void excluirPessoa(Pessoa pessoa) {
        String sql = "DELETE FROM pessoa WHERE nome = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    // Método para listar todas as pessoas do banco de dados
    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        String sql = "SELECT * FROM pessoa";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String sexo = resultSet.getString("sexo");
                double altura = resultSet.getDouble("altura");
                int idade = resultSet.getInt("idade");
                double peso = resultSet.getDouble("peso");
                pessoas.add(new Pessoa(nome, sexo, altura, idade, peso));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pessoas;
    }

    // Método para buscar uma pessoa pelo nome no banco de dados
    public Pessoa buscarPessoaPorNome(String nome) {
        String sql = "SELECT * FROM pessoa WHERE nome = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, nome);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String sexo = resultSet.getString("sexo");
                double altura = resultSet.getDouble("altura");
                int idade = resultSet.getInt("idade");
                double peso = resultSet.getDouble("peso");
                return new Pessoa(nome, sexo, altura, idade, peso);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
