import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-5, calculator.add(-2, -3));
        assertEquals(100, calculator.add(50, 50));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(3, 2));
        assertEquals(-1, calculator.dif(2, 3));
        assertEquals(0, calculator.dif(5, 5));
        assertEquals(-10, calculator.dif(0, 10));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3));
        assertEquals(0, calculator.div(1, 2));
        assertEquals(-3, calculator.div(-9, 3));

        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
        assertEquals(0, calculator.times(0, 5));
        assertEquals(-4, calculator.times(2, -2));
        assertEquals(100, calculator.times(10, 10));
    }

    @Test
    void solver() {
        assertEquals(16, calculator.solver());
    }
}