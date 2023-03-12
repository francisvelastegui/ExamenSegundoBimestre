package BL.Entities;

public class Usuario {
    private String vvUsuario;
    private String vvContrasena;
    private String vvNombre;
    
    public Usuario(String vvUsuario, String vvContrasena, String vvNombre) {
        this.vvUsuario = vvUsuario;
        this.vvContrasena = vvContrasena;
        this.vvNombre = vvNombre;
    }

    public Usuario() {
    }

    public String vvGetUsuario() {
        return vvUsuario;
    }

    public void vvSetUsuario(String vvUsuario) {
        this.vvUsuario = vvUsuario;
    }

    public String vvGetContrasena() {
        return vvContrasena;
    }

    public void vvSetContrasena(String vvContrasena) {
        this.vvContrasena = vvContrasena;
    }

    public String vvGetNombre() {
        return vvNombre;
    }

    public void vvSetNombre(String vvNombre) {
        this.vvNombre = vvNombre;
    }

    
}
