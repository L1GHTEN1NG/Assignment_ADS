import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me number of elements in array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.print("Give me elements of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        double average = AverageOfArray(n, array);
        System.out.println("Average: " + average);
    }

    public static double AverageOfArray(int n, int[] array) {
        double s = 0;
        for (int i = 0; i < n; i++){
            s += array[i];
        }
        return s / (double)n;
    }
}