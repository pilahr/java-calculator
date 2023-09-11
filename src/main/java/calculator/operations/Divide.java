package calculator.operations;

import calculator.Calculator;
import calculator.Operation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide extends Calculator implements Operation {
    @Override
    public void calculate() {
        double value = getLeftValue() / getRightValue();
        BigDecimal bd = new BigDecimal(value).setScale(4, RoundingMode.HALF_UP);
        double result = bd.doubleValue();
        setResult(result);
    }

    @Override
    public String getKeyWord() {
        return "divide";
    }

    @Override
    public char getSymbol() {
        return '÷';
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) {
        if (leftValue == 0 && rightValue == 0) {
            System.out.println("Error: Division zero by zero is not allowed.");
            System.exit(0);
            throw new ArithmeticException("Error: Division zero by zero is not allowed.");

        } else if (rightValue == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            System.exit(0);
            throw new NumberFormatException("Error: Division by zero is not allowed.");
        } else {
            setLeftValue(leftValue);
            setRightValue(rightValue);
            calculate();
        }
        return getResult();
    }
}
