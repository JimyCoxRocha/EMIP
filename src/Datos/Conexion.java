/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
 
    static Connection contacto = null;
    public static String usuario ="sa";
    public static String password = "123";

    public static Connection getConnectionDB() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=EMIP";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establece la conexion... revisar Driver" + e.getMessage(),
                    "Error de Conexion", JOptionPane.ERROR_MESSAGE);
            contacto=null;
        }
        try {
            contacto = DriverManager.getConnection(url, Conexion.usuario, Conexion.password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
                    "Error de Conexion", JOptionPane.ERROR_MESSAGE);
            contacto=null;
        }
        return contacto;
    }
}
