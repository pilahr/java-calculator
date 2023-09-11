package calculator;

import calculator.operations.*;

import java.util.Scanner;

public class CommandRunner {

    private static double leftVal;
    private static double rightVal;
    private static double result;
    private static String operator = "";

    private static StringBuilder sb = new StringBuilder();

    public static void clear() {
        leftVal = 0;
        rightVal = 0;
        result = 0;
        operator = "";
        sb.setLength(0);
        System.out.println(0);
    }


    public static String start() {

        System.out.println("-------------------------------------");
        System.out.println("\t\t== CALCULATOR ==");
        System.out.println("-------------------------------------");
        System.out.println("Select the option below");
        System.out.println("1:Calculation | 2:Exit");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("1")) {
            clear();
            System.out.println("Please insert the first value");

            Scanner scanner1 = new Scanner(System.in);
            leftVal = scanner1.nextDouble();

            calculate();
//            Add add = new Add();
//            Subtract subtract = new Subtract();
//            Multiply multiply = new Multiply();
//            Divide divide = new Divide();
//            SquareRoot squareRoot = new SquareRoot();
//            Square square = new Square();
//
//            System.out.println("Please insert the first value");
//
//            Scanner scanner1 = new Scanner(System.in);
//            leftVal = scanner1.nextDouble();
//
//            String seperator = " ";
//            System.out.println("Select the operator");
//            System.out.println("1: " + add.getSymbol() + seperator + add.getKeyWord());
//            System.out.println("2: " + subtract.getSymbol() + seperator + subtract.getKeyWord());
//            System.out.println("3: " + multiply.getSymbol() + seperator + multiply.getKeyWord());
//            System.out.println("4: " + divide.getSymbol() + seperator + divide.getKeyWord());
//            System.out.println("5: " + square.getSymbol() + seperator + square.getKeyWord());
//            System.out.println("6: " + squareRoot.getSymbol() + seperator + squareRoot.getKeyWord());
//
//            Scanner scanner2 = new Scanner(System.in);
//            String option = scanner2.nextLine();
////            String operator = "";
//
//            sb.append(leftVal);
//
//            if (option.equals("1")) {
//                operator += seperator + add.getSymbol() + seperator;
//
//                System.out.println(leftVal + operator);
//                System.out.println("Please insert the second value");
//
//                Scanner scanner3 = new Scanner(System.in);
//                Double rightVal = scanner3.nextDouble();
//
//                add.doCalculation(leftVal,rightVal);
//
//                result =  add.doCalculation(leftVal,rightVal);
//
//
//                sb.append(operator);
//                sb.append(rightVal);
//                sb.append(" = ");
//                sb.append(result);
//
//
//            } else if (option.equals("2")) {
//                operator += seperator + subtract.getSymbol() + seperator;
//
//                System.out.println(leftVal + operator);
//                System.out.println("Please insert the second value");
//
//                Scanner scanner3 = new Scanner(System.in);
//                Double rightVal = scanner3.nextDouble();
//
//                subtract.doCalculation(leftVal,rightVal);
//
//                Double result =  subtract.doCalculation(leftVal,rightVal);
//
//                sb.append(operator);
//                sb.append(rightVal);
//                sb.append(" = ");
//                sb.append(result);
//
//            } else if (option.equals("3")) {
//                operator += seperator + multiply.getSymbol() + seperator;
//
//                System.out.println(leftVal + operator);
//                System.out.println("Please insert the second value");
//
//                Scanner scanner3 = new Scanner(System.in);
//                rightVal = scanner3.nextDouble();
//
//                multiply.doCalculation(leftVal,rightVal);
//
//                Double result =  multiply.doCalculation(leftVal,rightVal);
//
//                sb.append(operator);
//                sb.append(rightVal);
//                sb.append(" = ");
//                sb.append(result);
//
//            } else if (option.equals("4")) {
//                operator += seperator + divide.getSymbol() + seperator;
//
//                System.out.println(leftVal + operator);
//                System.out.println("Please insert the second value");
//
//                Scanner scanner3 = new Scanner(System.in);
//                Double rightVal = scanner3.nextDouble();
//
//                divide.doCalculation(leftVal,rightVal);
//
//                Double result =  divide.doCalculation(leftVal,rightVal);
//
//                sb.append(operator);
//                sb.append(rightVal);
//                sb.append(" = ");
//                sb.append(result);
//
//            } else if (option.equals("5")) {
//                operator += seperator + square.getSymbol() + seperator;
//
//                System.out.println(leftVal + operator);
//
//                square.doCalculation(leftVal);
//
//                Double result =  square.doCalculation(leftVal);
//
//                sb.append(operator);
//                sb.append(" = ");
//                sb.append(result);
//
//            } else if (option.equals("6")) {
//                operator += seperator + squareRoot.getSymbol() + seperator;
//
//                System.out.println(leftVal + operator);
//
//                squareRoot.doCalculation(leftVal);
//
//                Double result =  squareRoot.doCalculation(leftVal);
//
//                sb.append(operator);
//                sb.append(" = ");
//                sb.append(result);
//
//            } else {
//                System.out.println();
//                System.out.println("Please select a valid option");
//            }


        } else {
            System.out.println("Exiting...");
            System.exit(0);
        }
        System.out.println(sb);
        calculate();

        return sb.toString();
    }


    public static void calculate() {
        Add add = new Add();
        Subtract subtract = new Subtract();
        Multiply multiply = new Multiply();
        Divide divide = new Divide();
        SquareRoot squareRoot = new SquareRoot();
        Square square = new Square();

        String separator = " ";
        System.out.println("---------------------------");
        System.out.println("= Select the operator =");
        System.out.println("1: " + add.getSymbol() + separator + add.getKeyWord());
        System.out.println("2: " + subtract.getSymbol() + separator + subtract.getKeyWord());
        System.out.println("3: " + multiply.getSymbol() + separator + multiply.getKeyWord());
        System.out.println("4: " + divide.getSymbol() + separator + divide.getKeyWord());
        System.out.println("5: " + square.getSymbol() + separator + square.getKeyWord());
        System.out.println("6: " + squareRoot.getSymbol() + separator + squareRoot.getKeyWord());
        System.out.println("7: Clear");
        System.out.println("---------------------------");

        Scanner scanner2 = new Scanner(System.in);
        String option = scanner2.nextLine();

        sb.append(leftVal);

        if (option.equals("1")) {
            operator += separator + add.getSymbol() + separator;

            System.out.println(leftVal + operator);

            System.out.println("Please insert the second value");
            Scanner scanner3 = new Scanner(System.in);
            rightVal = scanner3.nextDouble();

            add.doCalculation(leftVal,rightVal);
            result =  add.doCalculation(leftVal,rightVal);

            sb.append(operator);
            sb.append(rightVal);
            sb.append(" = ");
            sb.append(result);
            sb.append("\n");

        } else if (option.equals("2")) {
            operator += separator + subtract.getSymbol() + separator;
            System.out.println(leftVal + operator);

            System.out.println("Please insert the second value");
            Scanner scanner3 = new Scanner(System.in);
            rightVal = scanner3.nextDouble();

            subtract.doCalculation(leftVal,rightVal);
            result =  subtract.doCalculation(leftVal,rightVal);

            sb.append(operator);
            sb.append(rightVal);
            sb.append(" = ");
            sb.append(result);

        } else if (option.equals("3")) {
            operator += separator + multiply.getSymbol() + separator;
            System.out.println(leftVal + operator);

            System.out.println("Please insert the second value");
            Scanner scanner3 = new Scanner(System.in);
            rightVal = scanner3.nextDouble();

            multiply.doCalculation(leftVal,rightVal);
            result =  multiply.doCalculation(leftVal,rightVal);

            sb.append(operator);
            sb.append(rightVal);
            sb.append(" = ");
            sb.append(result);

        } else if (option.equals("4")) {
            operator += separator + divide.getSymbol() + separator;
            System.out.println(leftVal + operator);

            System.out.println("Please insert the second value");
            Scanner scanner3 = new Scanner(System.in);
            rightVal = scanner3.nextDouble();

            divide.doCalculation(leftVal,rightVal);
            result =  divide.doCalculation(leftVal,rightVal);

            sb.append(operator);
            sb.append(rightVal);
            sb.append(" = ");
            sb.append(result);

        } else if (option.equals("5")) {
            operator += separator + square.getSymbol() + separator;

            square.doCalculation(leftVal);
            result =  square.doCalculation(leftVal);

            sb.append(operator);
            sb.append(" = ");
            sb.append(result);

        } else if (option.equals("6")) {
            operator += separator + squareRoot.getSymbol() + separator;

            squareRoot.doCalculation(leftVal);
            result =  squareRoot.doCalculation(leftVal);

            sb.append(operator);
            sb.append(" = ");
            sb.append(result);

        } else if (option.equals("7")){
            clear();
            start();
        }else {
            System.out.println();
            System.out.println("Please select a valid option");
            calculate();
        }
        System.out.println(sb.toString());
        leftVal = result;
        operator = "";
        calculate();
    }
}
