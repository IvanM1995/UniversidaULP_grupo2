/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidaulp_grupo2;

//import AccesoDatos.Conexion;
import java.sql.Connection;
import java.time.LocalDate;
import universidaulp_grupo2.AccesoADatos.Conexion;
import universidaulp_grupo2.AccesoAdatos.AlumnoData;
import universidaulp_grupo2.Entidades.Alumno;

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
        
        
    
       Connection con = Conexion.getConexion();
       Alumno migue=new Alumno(4496454, "Augusto", "Lwil", LocalDate.of(1999, 5, 31), true);
       AlumnoData alu = new AlumnoData();
       alu.guardarAlumno(migue);
       
    }
    
}
