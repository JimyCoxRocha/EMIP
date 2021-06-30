package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UsuarioLogin {

    public static boolean login(Model.Usuario usuario) {
        Connection conexion;
        Statement statement;
        ResultSet resulset;

        //dbo.usuarios nombre de la base de datos
        //nomUsuario - es la columna dentro de la base de datos donde se guarda el nombre del usuario.
        String sql = "SELECT * FROM Usuario WHERE cedula='" + usuario.getCedula()+ "';";

        try {
            conexion = Datos.Conexion.getConnectionDB();
            statement = conexion.createStatement();
            resulset = statement.executeQuery(sql);

            while (resulset.next()) {
                usuario.setContraseña(resulset.getString("contrasenia"));
                if (usuario.getContraseña().equals(resulset.getString("contrasenia"))) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;

    }
}
