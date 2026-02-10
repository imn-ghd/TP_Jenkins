import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    @Test
    public void testFactorialZero() {
        // Test pour 0 (doit retourner 1)
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        // Test pour 1 (doit retourner 1)
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void testFactorialPositive() {
        // Test pour 5 (doit retourner 120)
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    public void testFactorialNegative() {
        // Test pour -1 (doit lever une exception IllegalArgumentException)
        // En Java, on utilise assertThrows au lieu de pytest.raises
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-1);
        });
    }
}