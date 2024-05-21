
package universidaulp_grupo2.AccesoAdatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidaulp_grupo2.AccesoADatos.Conexion;
import universidaulp_grupo2.Entidades.Materia;
/**
 *
 * @author Javier
 */
public class MateriaData {
    private Connection con= null;
    
    public MateriaData(){
        con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        
        String sql = "INSERT INTO materia(nombre, año, estado) VALUES (?, ?, ?)";
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
    
    public Materia buscarMateria(int id){
        Materia materia = null;
        String sql = "SELECT nombre, año FROM materia WHERE idMateria = ? AND estado = 1";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id );
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia=new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.isActivo();
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }        
        ps.close();
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia "+ex.getMessage()); 
        }
    return materia;
    }
    
     public List<Materia> listarMateria(){
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM materia WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado"));
                materias.add(materia);
             }
        ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla materia "+ex.getMessage());
        }
        return materias;
        }
  
}//Fin class
