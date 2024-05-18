
package universidaulp_grupo2.AccesoADatos;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Conexion {
    
    private static final String URL ="jdbc:mariadb://localhost/";
    private static final String BD= "universidadgp2";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    private static Connection connection;

    private Conexion() {
    }
    
    public static Connection getConexion(){
        if(connection == null){

            try {
                Class.forName("org.mariadb.jdbc.Driver"); //Cargando el Driver

                connection = DriverManager.getConnection(URL+BD + USUARIO  + PASSWORD);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD");
            }catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
            }

        }

     return connection;
    }    
    
}