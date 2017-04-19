import java.util.Scanner;

public class HangmanController {
    
    public static Character getInput(){
        Scanner reader = new Scanner(System.in);
        Character letter = reader.next().charAt(0);
        return letter;
    }
}
