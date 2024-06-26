/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidaulp_grupo2.AccesoAdatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidaulp_grupo2.Entidades.Alumno;
import universidaulp_grupo2.Entidades.Inscripcion;
import universidaulp_grupo2.Entidades.Materia;
import universidaulp_grupo2.AccesoADatos.Conexion;

/*
 *
 * @author Ivan
 */
public class InscripcionData {
    private Connection con = null;
    private MateriaData md = new MateriaData();
    private AlumnoData ad = new AlumnoData();
    
    public InscripcionData(){
        con= Conexion.getConexion();
        }
    
    public void guardarInscripcion(Inscripcion insc){
        
        String sql = "INSERT INTO inscripcion(idAlumno,idMateria,nota) VALUES(?,?,?)";
        
        try {
             PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1,insc.getAlumno().getIdAlumno());
             ps.setInt(2, insc.getMateria().getIdMateria());
             ps.setInt(3, (int) insc.getNota());
             ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                
                insc.setIdInscripcion(rs.getInt(1));
                
              JOptionPane.showMessageDialog(null, "Inscripcion registrada con exito");
               
            }
             ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripcion");
            
            
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void actulizarNota( int idAlumno, int idMateria, double nota ){
            
        try {
            String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ?";
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
            int filas=ps.executeUpdate();
            if(filas>0){
                
                JOptionPane.showMessageDialog(null, "La nota se actualizo con exito");
            }
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
            
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public List<Inscripcion>obtenerInscripciones(){
        
            ArrayList<Inscripcion> cursadas = new ArrayList<>();
            
            String sql="SELECT * FROM inscripcion";
            
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alum = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alum);
                insc.setMateria(mat);
                insc.setNota(rs.getInt("nota"));
                cursadas.add(insc);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
            
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return cursadas;
    
        
    }
    
    public List<Inscripcion>obtenerInscripcionesPorAlumno(int idAlumno){
        
         ArrayList<Inscripcion> cursadas = new ArrayList<>();
            
            String sql="SELECT * FROM inscripcion WHERE idAlumno = ?";
            
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alum = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alum);
                insc.setMateria(mat);
                insc.setNota(rs.getInt("nota"));
                cursadas.add(insc);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
            
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return cursadas;
        
        
        
        
        
    }
    
    public void borrarInscripcion(int idAlumno, int idMateria){
        
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
            
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int filas=ps.executeUpdate();
            if(filas > 0){
                
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada de la BD");
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   public List<Alumno>ObtenerAlumnosxMateria(int idMateria){  
         
       ArrayList<Alumno> alumnosMateria = new ArrayList<>();
       String sql =  "SELECT  a.idAlumno, dni, apellido, nombre, fechaN,estado" 
                   + " FROM inscripcion i , alumnos a "
                   + " WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1" ;
                        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            
            ResultSet rs = ps.executeQuery();
            
            
            while(rs.next())
                    {
                      Alumno alumno = new Alumno(); 
                       alumno.setIdAlumno(rs.getInt("idAlumno"));
                       alumno.setDni(rs.getInt("dni"));
                       alumno.setApellido(rs.getString("apellido"));
                       alumno.setNombre(rs.getString("nombre"));
                       alumno.setfechaN(rs.getDate("fechaN").toLocalDate());
                      //alumno.setEstado(rs.getBoolean("estado"));
                       alumno.setEstado(true); 
                    
                       alumnosMateria.add(alumno);
                    }
                        ps.close();
            }  catch (SQLException ex)  
                    {
                     JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripcion o tabla alumno" + ex.getMessage());
                     
                    }
        return alumnosMateria;       
   }
  
   public List<Materia> obternerMateriasNOCursadas(int idAlumno){  
         
       ArrayList<Materia>materias = new ArrayList<>();
       
       String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in"
               + "(SELECT idMateria From inscripcion WHERE idAlumno = ?)";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            
            ResultSet rs = ps.executeQuery();
            
            
            while(rs.next()){
                    
                        Materia materia = new Materia(); 
                       materia.setIdMateria(rs.getInt("idMateria"));
                       materia.setNombre(rs.getString("nombre"));
                       materia.setAnioMateria(rs.getInt("año"));
                       materia.setActivo(true); 
                    
                    
                       materias.add(materia);
                       
                      
                    }
                        ps.close();
            }  catch (SQLException ex)  
                    {
                     JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripcion" + ex.getMessage());
                    
                    }
        
        return materias;
     
     
      }
   
   public List<Materia> obtenerMateriasCursadas(int idAlumno){  
         
       ArrayList<Materia>materias = new ArrayList<>();
       String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion,"              
                    +" materia WHERE inscripcion.idMateria = materia.idMateria"
                    +" AND inscripcion.idAlumno = ?";    
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            ResultSet rs = ps.executeQuery();
            
            
            while(rs.next())
                    {
                     Materia materia = new Materia(); 
                       materia.setIdMateria(rs.getInt("idMateria"));
                       materia.setNombre(rs.getString("nombre"));
                       materia.setAnioMateria(rs.getInt("año"));
                       materia.setActivo(true); 
                    
                    
                       materias.add(materia);
                    }
                        ps.close();
            }  catch (SQLException ex)  
                    {
                     JOptionPane.showMessageDialog(null,"error al acceder a la tabla inscripcion" + ex.getMessage());
                    
                    }
        
        return materias;
     
     
      }
}


