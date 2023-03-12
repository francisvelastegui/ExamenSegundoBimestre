package BL.Entities;

public class Coordenadas {
    int vvCapacidadBelica;
    String vvGeo;
    String vvArsenal;
    
    public Coordenadas(int vvCapacidadBelica, String vvGeo, String vvArsenal) {
        this.vvCapacidadBelica = vvCapacidadBelica;
        this.vvGeo = vvGeo;
        this.vvArsenal = vvArsenal;
    }
    
    public int vvGetCapacidadBelica() {
        return vvCapacidadBelica;
    }

    public void vvSetCapacidadBelica(int vvCapacidadBelica) {
        this.vvCapacidadBelica = vvCapacidadBelica;
    }

    public String vvGetGeo() {
        return vvGeo;
    }

    public void vvSetGeo(String vvGeo) {
        this.vvGeo = vvGeo;
    }

    public String vvGetArsenal() {
        return vvArsenal;
    }

    public void vvSetArsenal(String vvArsenal) {
        this.vvArsenal = vvArsenal;
    }

    
}
