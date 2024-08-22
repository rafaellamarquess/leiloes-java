
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/leiloesdb";
    private static final String USER = "root"; //
    private static final String PASSWORD = "cherrybomb";

    public Connection connectDB() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Class.forName("com.mysql.jdbc.Driver")
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return conn;
    }
}
