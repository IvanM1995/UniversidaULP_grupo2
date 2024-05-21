
package universidaulp_grupo2.AccesoAdatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidaulp_grupo2.Entidades.Materia;
/**
 *
 * @author Javier
 */
public class MateriaData {
    private Connection con = null;
    
    public MateriaData(){
        con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        
        String sql = "INSERT INTO materia(nombre, anio, estado) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            System.out.println(materia.getNombre());
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                System.out.println("La materia: "+materia.getNombre()+" fue añadida con exito");
                JOptionPane.showMessageDialog(null, "Materia ID: "+materia.getIdMateria()); 
                
            }
            ps.close();

        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia: "+ex.getMessage()); 
        }
    
        }
  
}//Fin class
