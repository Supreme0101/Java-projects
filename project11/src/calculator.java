import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = s1.nextDouble();

        System.out.println("Enter second number:");
        double num2 = s1.nextDouble();

        System.out.println("Enter any operator (+, -, *, /):");
        char ope = s1.next().charAt(0);

        double result = 0;

        if (ope == '+') {
            result = num1 + num2;
        } else if (ope == '-') {
            result = num1 - num2;
        } else if (ope == '*') {
            result = num1 * num2;
        } else if (ope == '/') {
        } else {
            System.out.println("Invalid operator! Please use one of (+, -, *, /).");
            return;
        }
        System.out.println("The result is: " + result);
        s1.close();
    }
}

