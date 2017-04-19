import java.util.Scanner;

public class HangmanController {
    
    public static Character getChar(){
        Scanner reader = new Scanner(System.in);
        Character letter = reader.next().charAt(0);
        return letter;
    }
    public static Integer getInteger(){
        Scanner reader = new Scanner(System.in);
        Integer number = reader.nextInt();
        return number;
    }
}
