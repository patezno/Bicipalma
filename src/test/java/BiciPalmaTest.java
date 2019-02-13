import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BiciPalmaTest {

    private Estacion estacion = null;
    private Bicicleta bicicleta = null;
    private TarjetaUsuario tarjetaUsuario = null;

    @Before
    public void init() {

        estacion = new Estacion(1, "Manacor", 8);
        bicicleta = new Bicicleta(1);
        tarjetaUsuario = new TarjetaUsuario(1, true);

    }

    @Test
    public void gettersEstacionTest() {
        assertEquals(1, estacion.getId());
        assertEquals("Manacor", estacion.getDireccion());
        assertEquals(8, estacion.getNumeroAnclajes());
    }

    @Test
    public void gettersBicicletaTest() {
        assertEquals(1, bicicleta.getId());
    }

    @Test
    public void gettersTarjetaUsuarioTest() {
        assertEquals(1, tarjetaUsuario.getId());
        assertTrue(tarjetaUsuario.getActivada());
    }
}