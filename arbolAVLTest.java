import org.junit.Test;
import static org.junit.Assert.*;

public class arbolAVLTest {

    @Test
    public void testInsertAndSearch() {
        arbolAVL<Integer, String> tree = new arbolAVL<>();
        
        tree.insert(50, "Fifty");
        tree.insert(30, "Thirty");
        tree.insert(20, "Twenty");
        tree.insert(40, "Fourty");
        tree.insert(70, "Seventy");
        tree.insert(60, "Sixty");
        tree.insert(80, "Eighty");

        assertEquals("Fifty", tree.search(50));
        assertEquals("Twenty", tree.search(20));
        assertEquals("Seventy", tree.search(70));
        assertNull(tree.search(90));
    }
 }