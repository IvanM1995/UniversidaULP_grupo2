
package universidaulp_grupo2.AccesoAdatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class AlumnoData {
    private Connection con = null;
    
    public AlumnoData(){
        con = Conexion.getConexion();
    }
    
    public boolean guardarAlumno(Alumno alumno){
        boolean flag=false;
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento())); //De localDate a Date 
            ps.setBoolean(5, alumno.isEstado()); // if reducido
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) {

                alumno.setIdAlumno((rs.getInt("idAlumno")));
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
}
