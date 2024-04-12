import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Give me elements of that array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        ReverseArray(array, 0, n - 1);

        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void ReverseArray(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int value = array[start];
        array[start] = array[end];
        array[end] = value;

        ReverseArray(array, start + 1, end - 1);
    }
}