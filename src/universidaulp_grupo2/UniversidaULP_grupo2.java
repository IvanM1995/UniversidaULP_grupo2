/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidaulp_grupo2;

//import AccesoDatos.Conexion;
import java.sql.Connection;
import universidaulp_grupo2.AccesoADatos.Conexion;

/**
 *
 * @author Ivan
 */
public class UniversidaULP_grupo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Connection connection = Conexion.getConexion();
       
    }
    
}
