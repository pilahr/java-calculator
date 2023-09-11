package calculator;

public interface Operation {

    String getKeyWord();
    char getSymbol();

    double doCalculation(double leftValue, double rightValue);
}
