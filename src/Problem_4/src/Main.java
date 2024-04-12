import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me number to check: ");
        int n = scanner.nextInt();
        long factorial = FactorialFinder(n);
        System.out.println(factorial);
    }

    public static long FactorialFinder(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * FactorialFinder(n - 1);
        }
    }
}
