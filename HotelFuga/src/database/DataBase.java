package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataBase {
    
    private Connection connection;
    private Statement statement;

    public void connect() {
        try {
            // Carregando o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Configurando os parâmetros de conexão
            String url = "jdbc:mysql://localhost:3306/hotel";
            String usuario = "root";
            String senha = "";

            // Estabelecendo a conexão
            connection = DriverManager.getConnection(url, usuario, senha);
            statement = connection.createStatement();

            if (connection != null) {
                System.out.println("Conexão bem-sucedida!");
                // Aqui você pode executar operações no banco de dados
            } else {
                System.out.println("Falha na conexão.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados.");
            e.printStackTrace();
        }
    }

    public void register(String name, String email, String user, String password, String cpf, String telephone) {
        try {           
            if (connection == null || connection.isClosed()) {
                connect();
            }
            
            String query = "INSERT INTO manager (name, email, user, password, cpf, telephone) VALUES ('" + name + "', '" + email + "', '" + user + "', '" + password + "', '" + cpf + "', '" + telephone + "')";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {                 

                    // Execute a instrução de inserção
                    int linhasAfetadas = preparedStatement.executeUpdate();

                    if (linhasAfetadas > 0) {
                        System.out.println("Inserção realizada com sucesso!");
                    } else {
                        System.out.println("Falha ao inserir dados.");
                    }
                }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no banco de dados (função register):\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro (função register):\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public boolean login(String user, String password){
        try {           
            if (connection == null || connection.isClosed()) {
                connect();
            }
            
            String query = "SELECT * FROM manager WHERE user = ? AND password = ?";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {                 
                preparedStatement.setString(1, user);
                preparedStatement.setString(2, password);

                ResultSet resultSet = preparedStatement.executeQuery();
                
                return resultSet.next();
                }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no banco de dados (função register):\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro (função register):\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        return false;
    }
}
