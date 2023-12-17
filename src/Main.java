import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // scanner class to take in inputs

        System.out.println("Enter the first number: ");
        int a = s.nextInt();

        System.out.println("Enter the second number: ");
        int b = s.nextInt();

        System.out.println("Enter the third number: ");
        int c = s.nextInt();

        System.out.println(inputs(a, b, c));
        s.close();
    }

    public static boolean inputs(int a, int b, int c) {
        int[] numbers = {a, b, c};  // converts the passed variables to an array

        Arrays.sort(numbers);  //sorts the array

        int sum1 = numbers[1] - numbers[0];
        int sum2 = numbers[2] - numbers[1];

        return sum1 == sum2;
    }
}