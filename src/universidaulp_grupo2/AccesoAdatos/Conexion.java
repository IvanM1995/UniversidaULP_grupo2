
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
    
      private static final String URL = "jdbc:mariadb://localhost/";
    private static final String BD = "universidadgp2";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "";
    private static  Connection con; 

    private Conexion(){}

     public static Connection getConexion(){

         if(con == null){
             try {
                 Class.forName("org.mariadb.jdbc.Driver");
                 con = DriverManager.getConnection(URL + BD,USUARIO,CONTRASEÑA);

                 JOptionPane.showMessageDialog(null,"Conexion establecida con exito");

             } catch (ClassNotFoundException ex) {

                JOptionPane.showMessageDialog(null,"Error al cargar el driver");
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,"Error al conectarse a la Base de datos");
             }
         }
         return con;
     }
    
}