import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EstacionTest {

    private Estacion estacion = null;

    @Before
    public void init() {
        estacion = new Estacion(1, "Manacor", 8);
    }

    @Test
    public void gettersTest() {
        assertEquals(1, estacion.getId());
        assertEquals("Manacor", estacion.getDireccion());
        assertEquals(8, estacion.getNumeroAnclajes());
    }

    @Test
    public void freeAnchorages() {
        assertEquals(8, estacion.freeAnchorages());
    }

    @Test
    public void anchorBikeTest() {

        int[] bicicletas = {291, 292, 293, 294};

        for ( int id: bicicletas ){
            Bicicleta bicicleta = new Bicicleta(id);
            estacion.anchorBike(bicicleta);
        }

        assertEquals(4, estacion.freeAnchorages());
    }

    @Test
    public void removeBikeTest() {

        int[] bicicletas = {291, 292, 293, 294};

        for ( int id: bicicletas ){
            Bicicleta bicicleta = new Bicicleta(id);
            estacion.anchorBike(bicicleta);
        }

        TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);

        estacion.removeBike(tarjetaUsuario);

        assertEquals(5, estacion.freeAnchorages());


    }

}
