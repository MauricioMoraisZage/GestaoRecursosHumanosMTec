
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:mysql://localhost/recursoshumanos";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static boolean adicionarFuncionario(String nome, String cargo, double salario) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("INSERT INTO Funcionario (nome, cargo, salario) VALUES (?, ?, ?)")) {
            statement.setString(1, nome);
            statement.setString(2, cargo);
            statement.setDouble(3, salario);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean registrarFalta(int idFuncionario, LocalDate data) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("INSERT INTO Falta (idFuncionario, data) VALUES (?, ?)")) {
            statement.setInt(1, idFuncionario);
            statement.setDate(2, Date.valueOf(data));
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean registrarSalario(int idFuncionario, double valor) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("INSERT INTO Salario (idFuncionario, valor) VALUES (?, ?)")) {
            statement.setInt(1, idFuncionario);
            statement.setDouble(2, valor);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }   
   
    public void ExcluirFuncionarPorId(int id) {
        String query = "DELETE FROM funcionario WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
             statement.setInt(1, id);
             statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar o funcionario ");
        }
    }

    public void ExcluirFaltaPorId(int id) {
        String query = "DELETE FROM falta WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
             statement.setInt(1, id);
             statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar a falta ");
        }
    }
    
    public void ExcluirPagamentoPorId(int id) {
        String query = "DELETE FROM salario WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
             statement.setInt(1, id);
             statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar o Pagamento ");
        }
    }
    
}


    
    
    
    

