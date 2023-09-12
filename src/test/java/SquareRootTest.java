import calculator.operations.SquareRoot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {
    private SquareRoot squareRoot;

    @BeforeEach
    void setUp() {
        squareRoot = new SquareRoot();
    }

    @Test
    void squareRoot_ValidInput_CorrectAnswer() {
        double result = squareRoot.doCalculation(9);
        assertEquals(3, result);
    }

    @Test
    void squareRoot_DecimalInput_CorrectAnswer() {
        double result = squareRoot.doCalculation(968.25469);
        assertEquals(31.1168, result);
    }

    @Test
    void squareRoot_ZeroInput_CorrectAnswer() {
        double result = squareRoot.doCalculation(0);
        assertEquals(0, result);
    }

    @Test
    void squareRoot_NegativeInput_CorrectAnswer() {
        try {
            squareRoot.doCalculation(-9);
        }
        catch(NumberFormatException e) {
            Throwable exception = assertThrows(NumberFormatException.class, ()-> {
                throw new NumberFormatException("Error: Cannot find the square root of a negative number");
            });
            assertEquals("Error: Cannot find the square root of a negative number", exception.getMessage());
        }
    }

}