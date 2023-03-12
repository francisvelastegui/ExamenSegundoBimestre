package DAC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import BL.Entities.Coordenadas;

public class CoordenadasDac {
    private SQLiteDataHelper conexion = new SQLiteDataHelper();

    public List<Coordenadas> obtenerCoordenadas() {
        List<Coordenadas> vvCoordenadas = new ArrayList<>();
        Set<String> vvGeoposiciones = new HashSet<>();
        try (Connection conn = conexion.getCn();
             PreparedStatement stmt = conn.prepareStatement("SELECT CAPACIDAD_BELICA, GEOPOSICIONAMIENTO, ARSENAL FROM COORDENADAS");
             ResultSet rs = stmt.executeQuery()) {
    
            while (rs.next()) {
                int vvCapacidadBelica = rs.getInt("VVCAPACIDAD_BELICA");
                String vvGeo = rs.getString("VVGEO");
                String vvArsenal = rs.getString("VVARSENAL");
                if (!vvGeoposiciones.contains(vvGeo)) {
                    Coordenadas coordenada = new Coordenadas(vvCapacidadBelica, vvGeo, vvArsenal);
                    vvCoordenadas.add(coordenada);
                    vvGeoposiciones.add(vvGeo);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vvCoordenadas;
    }
    
}
