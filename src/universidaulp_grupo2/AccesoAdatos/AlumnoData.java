
package universidaulp_grupo2.AccesoAdatos;


import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidaulp_grupo2.Entidades.Alumno;
import universidaulp_grupo2.AccesoADatos.Conexion;

/**
 *
 * @author Javier
 */
public class AlumnoData {
    private Connection connection = null;
    
    public AlumnoData(){
        connection = Conexion.getConexion();
    }
    
    public boolean guardarAlumno(Alumno alumno){
        boolean flag=false;
        
        String sql = "INSERT INTO alumnos (dni,apellido, nombre, fechaN, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getfechaN())); //De localDate a Date 
            ps.setBoolean(5, alumno.isEstado()); // if reducido
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) {

                alumno.setIdAlumno((rs.getInt(1)));
                System.out.println("alumno id "+alumno.getIdAlumno());
                JOptionPane.showMessageDialog(null, "Alumno añadido con exito."); 
                flag=true;
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage()); 
        }
        return flag;
    }
     public Alumno buscarAlumno(int id){
        Alumno alumno = null;
       String sql = "SELECT dni, apellido, nombre, fechaN estado FROM alumnos WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
                    {
                       alumno = new Alumno(); 
                       alumno.setIdAlumno(id);
                       alumno.setDni(rs.getInt("dni"));
                       alumno.setApellido(rs.getString("apellido"));
                       alumno.setNombre(rs.getString("nombre"));
                       //alumno.setfechaN(rs.getDate("fechaN").toLocalDate());
                       alumno.setEstado(true); 
                    
                    }
            else{
                JOptionPane.showMessageDialog(null, "Alumno inexistente");
                ps.close();
            }
            }  catch (SQLException ex)  
                    {
                     JOptionPane.showMessageDialog(null,"error al acceder a la tabla Alumno" + ex.getMessage());
                    
                    }
        
            
                    return alumno;
                    
             }
     
     public Alumno buscarAlumnoPorDni(int dni){
        Alumno alumno = null;
       String sql = "SELECT  idAlumno dni, apellido, nombre, fechaN estado FROM alumnos WHERE dni = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            
             ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
                    {
                       alumno = new Alumno(); 
                       alumno.setIdAlumno(rs.getInt("idAlumno"));
                       alumno.setDni(rs.getInt("dni"));
                       alumno.setApellido(rs.getString("apellido"));
                       alumno.setNombre(rs.getString("nombre"));
                       //alumno.setfechaN(rs.getDate("fechaN").toLocalDate());
                       alumno.setEstado(true); 
                    
                    }
            else{
                JOptionPane.showMessageDialog(null, "Alumno inexistente");
                ps.close();
            }
            }  catch (SQLException ex)  
                    {
                     JOptionPane.showMessageDialog(null,"error al acceder a la tabla Alumno" + ex.getMessage());
                    
                    }
        
            
                    return alumno;
                    
             }
     public void modificarAlumnos(Alumno alumno){
        String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ? WHERE idAlumno = ?";
        PreparedStatement ps = null;
        try{           
            ps = connection.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getfechaN()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            }else{
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumno"+ ex.getMessage());
        }
    }
             
     public void eliminarAlumno(int id){
         
         String sql = "UPDATE alumnos SET estado = 0 WHERE idAlumno = ?";
         
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            
            int exito=ps.executeUpdate();
            if(exito==1){
                
                JOptionPane.showMessageDialog(null, "Alumno removido de la BD con exito");
            }
            
        } catch (SQLException ex) {
            
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos");
           
        }
              
     }
     
     public List<Alumno>listarAlumnos(){  
         
       ArrayList<Alumno>alumnos = new ArrayList<>();
       String sql = "SELECT  idAlumno, dni, apellido, nombre, fechaN FROM alumnos WHERE estado = 1";       
        try {
            
            PreparedStatement ps = connection.prepareStatement(sql);
            
            
            ResultSet rs = ps.executeQuery();
            
            
            while(rs.next())
                    {
                      Alumno alumno = new Alumno(); 
                       alumno.setIdAlumno(rs.getInt("idAlumno"));
                       alumno.setDni(rs.getInt("dni"));
                       alumno.setApellido(rs.getString("apellido"));
                       alumno.setNombre(rs.getString("nombre"));
                       //alumno.setfechaN(rs.getDate("fechaN").toLocalDate());
                       alumno.setEstado(true); 
                    
                       alumnos.add(alumno);
                    }
                        ps.close();
            }  catch (SQLException ex)  
                    {
                     JOptionPane.showMessageDialog(null,"error al acceder a la tabla Alumno" + ex.getMessage());
                    
                    }
        
        return alumnos;
        
    }
     
     
     
}
