import org.junit.Test;
import static org.junit.Assert.*;
public class arbolRojoNegroTest {

    @Test
    public void testInsertAndSearch() {
        arbolRojoNegro<Integer, String> arbol = new arbolRojoNegro<>();
        arbol.insert(1, "A");
        arbol.insert(2, "B");
        arbol.insert(3, "C");

        assertEquals("A", arbol.search(1));
        assertEquals("B", arbol.search(2));
        assertEquals("C", arbol.search(3));
        assertNull(arbol.search(4));
    }
 }