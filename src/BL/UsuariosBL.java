package BL;

import java.sql.SQLException;

import BL.Entities.Usuario;

public class UsuarioBL {
    public Usuario vvGetUsuarioBL(String usuario, String contrasena) throws SQLException{
        try {
            UsuarioDAC vvGetUsuario = new UsuarioDAC();
            ResultSet vvRs = vvUsuarioDac.vvGetUsuarioBL(usuario, contrasena);

            Usuario vvUsuario = new Usuario(
                vvRs.getString("USUARIO"),
                vvRs.getString("CONTRASENA"),
                vvRs.getString("NOMBRE"));
            return vvUsuario;
        } catch (Exception e) {
            System.out.println("Fallo en vvGetUsuarioBL(String usuario, String contrasena)");
        }
        return null;
    }

    /**
     * @param vvInput
     * @return
     */
    public static String vvEncriptContrasena(String vvInput){
        public static void main(String[] args) {
            String password = "secreto";
            String encryptPassword = vvEncriptarContrasena(password);
            System.out.println("Contraseña original: " + password);
            System.out.println("Contraseña encriptada: " + encryptPassword);
        }
        
        public static String ccEncriptContrasena(String vvInput) {
            String md5 = null;
            if (null == vvInput)
            return null;
            try {
                // Create MessageDigest object for MD5           
                MessageDigest digest = MessageDigest.getInstance("MD5");
                // Update input string in message digest            
                digest.update(input.getBytes(), 0, input.length());
                // Converts message digest value in base 16 (hex)            
                md5 = new BigInteger(1, digest.digest()).toString(16);
            } catch (NoSuchAlgorithmException e) {
                printStackTrace();
            }
            return md5;
        }
    }
}
