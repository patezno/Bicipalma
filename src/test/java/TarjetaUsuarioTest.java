import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TarjetaUsuarioTest {

    private TarjetaUsuario tarjetaUsuario = null;

    @Before
    public void init() {
        tarjetaUsuario = new TarjetaUsuario("10001", true);
    }

    @Test
    public void gettersTest() {
        assertEquals("10001", tarjetaUsuario.getId());
        assertTrue(tarjetaUsuario.getActivada());
    }

}
