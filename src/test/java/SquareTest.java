import calculator.operations.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square square;

    @BeforeEach
    void setUp() {
        square = new Square();
    }

    @Test
    void square_ValidInput_CorrectAnswer() {
        double result = square.doCalculation(3);
        assertEquals(9, result);
    }

    @Test
    void square_DecimalInput_CorrectAnswer() {
        double result = square.doCalculation(7.2356);
        assertEquals(52.3539, result);
    }

    @Test
    void square_ZeroInput_CorrectAnswer() {
        double result = square.doCalculation(0);
        assertEquals(0, result);
    }

    @Test
    void square_NegativeInput_CorrectAnswer() {
        double result = square.doCalculation(-3);
        assertEquals(9, result);
    }
}