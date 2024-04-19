import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me value of string: ");
        String s = scanner.nextLine();

        System.out.print("Give me symbol: ");
        char symbol = scanner.next().charAt(0);

        System.out.print("Number of character " + symbol + " in string " + s + " is " + CheckCharacter(symbol, s, 0));
    }

    public static int CheckCharacter(char c, String s, int index){
        if (index >= s.length()){
            return 0;
        }

        if (s.charAt(index) == c){
            return 1 + CheckCharacter(c, s, index + 1);
        } else{
            return CheckCharacter(c, s, index + 1);
        }
    }
}
