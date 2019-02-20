import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BicicletaTest {

    private Bicicleta bicicleta = null;

    @Before
    public void init() {
        bicicleta = new Bicicleta(1);
    }

    @Test
    public void gettersTest() {
        assertEquals(1, bicicleta.getId());
    }

}
