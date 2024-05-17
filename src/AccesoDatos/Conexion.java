/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String BD = "universidadgp2";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "";
    private static  Connection con; 
    
    private Conexion(){}
    
     public static Connection getcConexion(){
         
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
