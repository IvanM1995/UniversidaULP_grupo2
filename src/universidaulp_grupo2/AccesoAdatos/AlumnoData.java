
package universidaulp_grupo2.AccesoAdatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidaulp_grupo2.Entidades.Alumno;
import universidaulp_grupo2.AccesoADatos.Conexion;

/**
 *
 * @author Javier
 */
public class AlumnoData {
    private Connection connection = null;
    
    private AlumnoData(){
        connection = Conexion.getConexion();
    }
    
    public boolean guardarAlumno(Alumno alumno){
        boolean flag=false;
        String sql = "INSERT INTO alumnos (dni, apellido, nombre, fechaN, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaN())); //De localDate a Date 
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
        String sql = "SELECT dni, apellido, nombre, fechaN, estado FROM alumno"
                + "WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
                    {
                       alumno = new Alumno(); 
                       alumno.setIdAlumno(rs.getInt("idAlumno"));
                       alumno.setDni(rs.getInt("dni"));
                       alumno.setApellido(rs.getString("apellido"));
                       alumno.setNombre(rs.getString("nombre"));
                       alumno.setFechaNacimiento(rs.getDate("fechaN").toLocalDate());
                       alumno.setEstado(true); 
                    
                    }
            else{
                JOptionPane.showMessageDialog(null, "ALumno inexistente");
                ps.close();
            }
            }  catch (SQLException ex)  
                    {
                     JOptionPane.showMessageDialog(null,"error al acceder a la tabla ALumno" + ex.getMessage());
                    
                    }
        
            
                    return alumno;
                    
             }
        
} 
    
       

