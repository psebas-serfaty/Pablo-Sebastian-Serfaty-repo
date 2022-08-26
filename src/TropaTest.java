import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TropaTest {
    @Test
    void debe_crear_un_soldado() {
        Tropa soldado1 = new Tropa("soldado1", 1, 1.0f);
        assertNotNull(soldado1);
        assertEquals("soldado1", soldado1.getNombre());
    }

    @Test
    void debe_atacar_a_otra_tropa(){
        Tropa tanque1 = new Tropa("tanque1", 1, 2.0f);
        Tropa soldado1 = new Tropa("soldado1", 1, 1.0f);
        Escudo escudo = new Escudo();
        tanque1.atacar(soldado1, escudo);
        assertEquals(0.50f, soldado1.getVida(), 0.0f);
        tanque1.atacar(soldado1, escudo);
        assertEquals(0.0f, soldado1.getVida(), 0.0f);
    }
}
