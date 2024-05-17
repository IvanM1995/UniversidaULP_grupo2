
package universidaulp_grupo2.AccesoAdatos;

import java.sql.Connection;

/**
 *
 * @author Javier
 */
public class AlumnoData {
  
    private Connection con = null;
    
    public AlumnoData(){
        con = Conexion.getConexion();
    }
}
