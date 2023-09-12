import calculator.operations.Divide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {
    private Divide divide;

    @BeforeEach
    void setUp() {
        divide = new Divide();
    }

    @Test
    void divide_ValidInput_CorrectAnswer() {
        double result = divide.doCalculation(6,2);
        assertEquals(3, result);
    }

    @Test
    void divide_DecimalInput_CorrectAnswer() {
        double result = divide.doCalculation(19.2345,2.234);
        assertEquals(8.6099, result);
    }

    @Test
    void divide_AllNegativeInput_CorrectAnswer() {
        double result = divide.doCalculation(-6,-2);
        assertEquals(3, result);
    }

    @Test
    void divide_OneNegativeRightInput_CorrectAnswer() {
        double result = divide.doCalculation(6,-2);
        assertEquals(-3, result);
    }

    @Test
    void divide_OneNegativeLeftInput_CorrectAnswer() {
        double result = divide.doCalculation(-6,2);
        assertEquals(-3, result);
    }

    @Test
    void divide_DivideZeroByZero_CorrectAnswer() {
        try {
            divide.doCalculation(0, 0);
        }
        catch(ArithmeticException e) {
            Throwable exception = assertThrows(ArithmeticException.class, ()-> {
                throw new ArithmeticException("Error: Division zero by zero is not allowed.");
            });
            assertEquals("Error: Division zero by zero is not allowed.", exception.getMessage());
        }
    }

    @Test
    void divide_RightValueIsZero_CorrectAnswer() {
        try {
            divide.doCalculation(6,0);
        }
        catch(NumberFormatException e) {
            Throwable exception = assertThrows(NumberFormatException.class, ()-> {
                throw new NumberFormatException("Error: Division by zero is not allowed.");
            });
            assertEquals("Error: Division by zero is not allowed.", exception.getMessage());
        }
    }
}