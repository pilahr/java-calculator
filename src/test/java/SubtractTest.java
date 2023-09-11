import calculator.operations.Subtract;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractTest {
    private Subtract subtract;

    @BeforeEach
    void setUp() {
        subtract = new Subtract();
    }

    @Test
    void subtract_ValidInput_CorrectAnswer() {
        double result = subtract.doCalculation(75,12);
        assertEquals(63, result);
    }

    @Test
    void subtract_DecimalInputExpectFourDecimalResult_CorrectAnswer() {
        double result = subtract.doCalculation(75.45678,12.324989);
        assertEquals(63.1318, result);
    }

    @Test
    void subtract_ZeroInput_CorrectAnswer() {
        double result = subtract.doCalculation(0,0);
        assertEquals(0, result);
    }

    @Test
    void subtract_AllNegativeInput_CorrectAnswer() {
        double result = subtract.doCalculation(-9,-2);
        assertEquals(-7, result);
    }

    @Test
    void subtract_OneNegativeRightInput_CorrectAnswer() {
        double result = subtract.doCalculation(7,-3);
        assertEquals(10, result);
    }

    @Test
    void subtract_OneNegativeLeftInput_CorrectAnswer() {
        double result = subtract.doCalculation(-7,3);
        assertEquals(-10, result);
    }

    @Test
    void subtract_OneNegativeInputNegativeResult_CorrectAnswer() {
        double result = subtract.doCalculation(-9,0);
        assertEquals(-9, result);
    }



}