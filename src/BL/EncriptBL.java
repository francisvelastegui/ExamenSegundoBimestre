package BL;

public class EncriptBL {
    public static void main(String[] args) {
        String password = "secreto";
        String encryptPassword = vvEncriptarContrasena(password);
        System.out.println("Contraseña original: " + password);
        System.out.println("Contraseña encriptada: " + encryptPassword);
    }
    
    public static String ccEncriptarContrasena(String input) {
        String md5 = null;
        if (null == input)
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
