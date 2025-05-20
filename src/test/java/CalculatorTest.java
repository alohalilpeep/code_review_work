import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, calculator.add(0, 0), "0 + 0 should equal 0");
        assertEquals(-1, calculator.add(2, -3), "2 + (-3) should equal -1");
        assertEquals(Integer.MAX_VALUE - 1, calculator.add(Integer.MAX_VALUE - 2, 1),
                "Edge case near MAX_VALUE");
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(3, 2), "3 - 2 should equal 1");
        assertEquals(-5, calculator.dif(0, 5), "0 - 5 should equal -5");
        assertEquals(0, calculator.dif(10, 10), "10 - 10 should equal 0");
        assertEquals(Integer.MIN_VALUE + 1, calculator.dif(Integer.MIN_VALUE + 2, 1),
                "Edge case near MIN_VALUE");
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(4, 2), "4 / 2 should equal 2");
        assertEquals(0, calculator.div(0, 5), "0 / 5 should equal 0");
        assertEquals(-3, calculator.div(9, -3), "9 / (-3) should equal -3");

        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0),
                "Division by zero should throw ArithmeticException");
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3), "2 * 3 should equal 6");
        assertEquals(0, calculator.times(0, 5), "0 * 5 should equal 0");
        assertEquals(-15, calculator.times(3, -5), "3 * (-5) should equal -15");
        assertEquals(Integer.MAX_VALUE, calculator.times(Integer.MAX_VALUE, 1),
                "Edge case with MAX_VALUE");
    }

    @Test
    void solver() {
        // Testing the example calculation: (2 + 3) * (5 - 1) / 2 = 10
        assertEquals(10, calculator.solver(), "solver() should return 10 for the implemented calculation");
    }
}