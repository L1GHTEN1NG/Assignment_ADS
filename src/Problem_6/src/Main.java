import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me value: ");
        int a = scanner.nextInt();

        System.out.print("Give me power: ");
        int n = scanner.nextInt();

        int result = PowerOfNumber(a, n);
        System.out.println("Number " + a + " in the power of " + n + " is equals to " + result);
    }

    public static int PowerOfNumber(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * PowerOfNumber(a, n - 1);
    }
}