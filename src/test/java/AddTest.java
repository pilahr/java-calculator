import calculator.operations.Add;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {
    private Add add;

    @BeforeEach
    void setUp() {
        add = new Add();
    }

    @Test
    void add_ValidInput_CorrectAnswer() {
        double result = add.doCalculation(2,4);
        assertEquals(6, result);
    }

    @Test
    void add_DecimalInput_CorrectAnswer() {
        double result = add.doCalculation(5.432,4.122);
        assertEquals(9.554, result);
    }

    @Test
    void add_DecimalInputExpectFourDecimalResult_CorrectAnswer() {
        double result = add.doCalculation(5.43256,4.1228);
        assertEquals(9.5554, result);
    }

    @Test
    void add_ZeroInput_CorrectAnswer() {
        double result = add.doCalculation(0,0);
        assertEquals(0, result);
    }

    @Test
    void add_AllMinusInput_CorrectAnswer() {
        double result = add.doCalculation(-7,-2);
        assertEquals(-9, result);
    }

    @Test
    void add_OneMinusRightInput_CorrectAnswer() {
        double result = add.doCalculation(2,-2);
        assertEquals(0, result);
    }

    @Test
    void add_OneMinusLeftInput_CorrectAnswer() {
        double result = add.doCalculation(-5,2);
        assertEquals(-3, result);
    }

    @Test
    void add_OneMinusInputExpectMinusResult_CorrectAnswer() {
        double result = add.doCalculation(-6,0);
        assertEquals(-6, result);
    }

}