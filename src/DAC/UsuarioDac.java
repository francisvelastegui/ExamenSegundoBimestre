package DAC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import BL.Entities.Usuario;

/**
 *
 * @author villarrealvelasteguí
 */
public class UsuarioDac {
    private SQLiteDataHelper conexion = new SQLiteDataHelper();
    

    public boolean vvAutenticarUsuario(Usuario Usuario) {
        String sql = "SELECT * FROM usuarios WHERE VVUSUARIO = ? AND VVCONTRASENA = ?";
        try (Connection conn = conexion.getCn();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, Usuario.vvGetUsuario());
            pstmt.setString(2, Usuario.vvGetContrasena() );
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (Exception ex) {
               
            return false;
        }
    }
}