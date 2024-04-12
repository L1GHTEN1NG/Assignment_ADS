import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me value: ");
        int n = scanner.nextInt();

        long fibonacci = FibonacciFinder(n);
        System.out.println(n + "th Fibonacci number value is: " + fibonacci);
    }

    public static long FibonacciFinder(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return FibonacciFinder(n - 1) + FibonacciFinder(n - 2);
        }
    }
}