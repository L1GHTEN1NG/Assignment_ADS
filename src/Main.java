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

        int min = findMin(n, array);
        System.out.println("Minimum element: " + min);
    }

    public static int findMin(int n, int[] array) {
        if (n == 0 || array == null) {
            System.out.print("Array is empty");
        }

        int min = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}