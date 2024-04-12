import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me value of n: ");
        int n = scanner.nextInt();

        System.out.print("Give me value of k: ");
        int k = scanner.nextInt();

        System.out.println("Binomial Coefficient value is " + BinomialCoef(n, k));

    }

    public static int BinomialCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        return BinomialCoef(n - 1, k - 1) + BinomialCoef(n - 1, k);
    }
}