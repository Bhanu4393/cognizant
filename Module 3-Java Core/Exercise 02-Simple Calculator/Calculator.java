import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        char operation = sc.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;

            default:
                System.out.println("Invalid operation");
        }

        sc.close();
    }
}