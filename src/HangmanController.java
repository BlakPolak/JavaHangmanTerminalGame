import java.util.ArrayList;
import java.util.Scanner;

public class HangmanController {

    public static Character getChar(){
        Scanner reader = new Scanner(System.in);
        Character letter = reader.next().charAt(0);
        Character letterUppercase = Character.toUpperCase(letter);
        String letterUppercaseStr = Character.toString(letterUppercase);
        HangmanModel.guessedletters.add(letterUppercaseStr);
        String joined = String.join(",", HangmanModel.guessedletters);
        HangmanView.print("Used characters: ");
        HangmanView.print(joined); // printowanie tej listy
        return letterUppercase;
    }

    public static String getWord(){
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine().toUpperCase();
        return word;
    }

    public static Integer getInteger(){
        Scanner reader = new Scanner(System.in);
        Integer number = reader.nextInt();
        return number;
    }
}
