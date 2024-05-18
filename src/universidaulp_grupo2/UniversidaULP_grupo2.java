/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidaulp_grupo2;

//import AccesoDatos.Conexion;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
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
       
//        Alumno migue=new Alumno(4296454, "Augusto", "Lwil", LocalDate.of(1999, 5, 31), true);
//        AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(migue);
//       
//        Alumno juan=new Alumno(4396454, "Juan", "Rodriguez", LocalDate.of(1999, 1, 21), true);
//        AlumnoData alum = new AlumnoData();
//        alum.guardarAlumno(juan);
//        //alum.eliminarAlumno(0);
//        //alum.buscarAlumno(0);
//            alum.listarAlumnos();
//       
//        Alumno nestor=new Alumno(4196454, "Nestor", "Diaz", LocalDate.of(1999, 8, 11), true);
//        AlumnoData alun = new AlumnoData();
//       //alun.eliminarAlumno(5);
//       alun.guardarAlumno(nestor);
//       //alun.buscarAlumno(1);
       
       
//       Alumno migue=new Alumno(4496454, "Augusto", "Lwil", LocalDate.of(1999, 5, 31), true);
//       AlumnoData alu = new AlumnoData();
//       alu.guardarAlumno(migue);
       
//       Alumno jose=new Alumno(4321234,"Jose","Hernandez",LocalDate.of(1992, 7, 22),false);
//       AlumnoData alumn = new AlumnoData();
       //alu.eliminarAlumno(5);
       //alu.guardarAlumno(jose);
       //alu.buscarAlumno(1);
       
//       Alumno Ricardo=new Alumno(4123425,"Ricardo","Morales",LocalDate.of(1992, 1, 12),true);
       //AlumnoData alum = new AlumnoData();
       //alum.guardarAlumno(Ricardo);
       //alum.eliminarAlumno(9);
//       
//       Alumno alumnoEncontrado = alum.buscarAlumno(1);
//       if(alumnoEncontrado !=null){
//        System.out.println("dni " + alumnoEncontrado.getDni());
//        System.out.println("apellido " + alumnoEncontrado.getApellido());
//       
//    }
      
        AlumnoData alu = new AlumnoData();
        for(Alumno alumno:alu.listarAlumnos()){
            
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getfechaN());
            System.out.println("");
        }
  }
    
    
}
