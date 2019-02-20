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

}
