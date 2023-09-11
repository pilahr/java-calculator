package calculator.operations;

import calculator.Calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Square extends Calculator {
    public void calculate() {
        double value = getLeftValue() * getLeftValue();
        BigDecimal bd = new BigDecimal(value).setScale(4, RoundingMode.HALF_UP);
        double result = bd.doubleValue();
        setResult(result);
    }

    public String getKeyWord() {
        return "square";
    }

    public String getSymbol() {
        return "x²";
    }

    public double doCalculation(double leftValue) {
        setLeftValue(leftValue);
        calculate();
        return getResult();
    }
}
