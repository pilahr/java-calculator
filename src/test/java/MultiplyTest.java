import calculator.operations.Multiply;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    private Multiply multiply;

    @BeforeEach
    void setUp() {
        multiply = new Multiply();
    }

    @Test
    void multiply_ValidInput_CorrectAnswer() {
        double result = multiply.doCalculation(4, 5);
        assertEquals(20, result);
    }

    @Test
    void multiply_DecimalInput_CorrectAnswer() {
        double result = multiply.doCalculation(2.34, 5.22);
        assertEquals(12.2148, result);
    }


    @Test
    void multiply_DecimalInputExpectFourDecimalResult_CorrectAnswer() {
        double result = multiply.doCalculation(2.34333, 5.22129);
        assertEquals(12.2352, result);
    }


    @Test
    void multiply_ZeroInput_CorrectAnswer() {
        double result = multiply.doCalculation(0, 0);
        assertEquals(0, result);
    }

    @Test
    void multiply_OneZeroInput_CorrectAnswer() {
        double result = multiply.doCalculation(0, 5);
        assertEquals(0, result);
    }

    @Test
    void multiply_AllNegativeInput_CorrectAnswer() {
        double result = multiply.doCalculation(-9, -5);
        assertEquals(45, result);
    }

    @Test
    void multiply_OneNegativeRightInputExpectNegativeResult_CorrectAnswer() {
        double result = multiply.doCalculation(4, -5);
        assertEquals(-20, result);
    }

    @Test
    void multiply_OneNegativeLeftInputExpectNegativeResult_CorrectAnswer() {
        double result = multiply.doCalculation(-4, 5);
        assertEquals(-20, result);
    }
}