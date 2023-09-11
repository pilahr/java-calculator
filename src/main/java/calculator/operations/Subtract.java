package calculator.operations;

import calculator.Calculator;
import calculator.Operation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Subtract extends Calculator implements Operation {
    @Override
    public void calculate() {
        double value = getLeftValue() - getRightValue();
        BigDecimal bd = new BigDecimal(value).setScale(4, RoundingMode.HALF_UP);
        double result = bd.doubleValue();
        setResult(result);
    }

    @Override
    public String getKeyWord() {
        return "subtract";
    }

    @Override
    public char getSymbol() {
        return '-';
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) {
        setLeftValue(leftValue);
        setRightValue(rightValue);
        calculate();
        return getResult();
    }
}
