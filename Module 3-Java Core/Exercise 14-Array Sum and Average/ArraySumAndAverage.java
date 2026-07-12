import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] numbers = new int[count];
        int total = 0;

        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
            total += numbers[i];
        }

        double average = (double) total / count;

        System.out.println("Sum = " + total);
        System.out.println("Average = " + average);

        sc.close();
    }
}