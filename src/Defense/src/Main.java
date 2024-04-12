import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me value of string: ");
        String s = scanner.nextLine();

        System.out.print("Give me character: ");
        char a = 'a';


        System.out.print("Number of character " + a + " in string " + s + " is " + CheckCharacter(a, s));
    }

    public static int CheckCharacter(char a, String s){
        int value = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == s.charAt(0)){
                break;
            }

            if (s.charAt(i) == a){
                value++;
                CheckCharacter(a, s);
            }
        }

        return value;
    }
}
