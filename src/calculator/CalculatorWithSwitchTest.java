package calculator;

import java.util.Scanner;

public class CalculatorWithSwitchTest implements Calculator{
    static double total=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter arithmetic operator: ");
        char operator=sc.next().charAt(0);

        switch (operator){
            case '+': System.out.println(new CalculatorWithSwitchTest().addition(2,6));
            break;
            case '-': System.out.println(new CalculatorWithSwitchTest().subtraction(6,2));
            break;
            case '*': System.out.println(new CalculatorWithSwitchTest().multiplication(2,2,1));
            break;
            case '%': System.out.println(new CalculatorWithSwitchTest().remainder(5,2));
            break;
            case '/': System.out.println(new CalculatorWithSwitchTest().division(5,2));
                break;
            default:
                System.out.println("Not a valid arithmetic operator");
        }

    }
    @Override
    public double addition(double... numbers) {
        for (double number : numbers){
            total += number;
        }
        return total;
    }

    @Override
    public double subtraction(double... numbers) {
        for (double number : numbers){
            total -= number;
        }
        return total;
    }

    @Override
    public double multiplication(double... numbers) {
        for (double number : numbers){
            total *= number;
        }
        return total;
    }

    @Override
    public double division(double... numbers) {
        for (double number : numbers){
            total /= number;
        }
        return total;
    }

    @Override
    public double remainder(double... numbers) {
        for (double number : numbers){
            total %= number;
        }
        return total;
    }
}
