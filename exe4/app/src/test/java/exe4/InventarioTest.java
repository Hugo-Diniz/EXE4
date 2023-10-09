package exe4;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class InventarioTest {

    @Test
    void testIterator() {
        InventarioIF inv = new Inventario();
        inv.setTamanho(10);
        assertDoesNotThrow(() -> inv.adicionarItem(new Arma("Faca", 50)));
        assertDoesNotThrow(() -> inv.adicionarItem(new Arma("Foice", 60)));
        assertDoesNotThrow(() -> inv.adicionarItem(new Arma("Cabo de vassoura", 10)));
        assertDoesNotThrow(() -> inv.adicionarItem(new Arma("Revolver", 80)));

        String[] nomes = new String[]{ "Faca", "Foice", "Cabo de vassoura", "Revolver"};
        int current = 0;

        for (ItemJogo item: inv) {
            assertEquals(nomes[current++], item.getNome());
        }

        Iterator<ItemJogo> iterador = inv.iterator();
        assertTrue(iterador.hasNext());
        for (int i = 0; i < 4; i++) {
            iterador.next();
        }
        assertFalse(iterador.hasNext());
    }
}
