import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me number to check if it's prime: ");
        int n = scanner.nextInt();

        boolean prime = PrimeChecker(n);
        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    public static boolean PrimeChecker(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}