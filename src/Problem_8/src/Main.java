import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me value of string: ");
        String s = scanner.nextLine();

        if (CheckDigitsInString(s)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

    }

    public static boolean CheckDigitsInString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}