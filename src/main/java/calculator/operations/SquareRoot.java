package calculator.operations;

import calculator.Calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SquareRoot extends Calculator {

    public void calculate() {
        double value = Math.sqrt(getLeftValue());
        BigDecimal bd = new BigDecimal(value).setScale(4, RoundingMode.HALF_UP);
        double result = bd.doubleValue();
        setResult(result);
    }

    public String getKeyWord() {
        return "square root";
    }

    public char getSymbol() {
        return '√';
    }

    public double doCalculation(double leftValue) {
        setLeftValue(leftValue);
        if (leftValue < 0) {
            System.out.println("Error: Cannot find the square root of a negative number");
            throw new NumberFormatException();
        } else {
            calculate();
        }
        return getResult();
    }


}
