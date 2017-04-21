import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Runtime;

public class HangmanController {

    public static Character getChar(){
        Scanner reader = new Scanner(System.in);
        Character letter = reader.next().charAt(0);
        Character letterUppercase = Character.toUpperCase(letter);
        boolean checkIfNotUsed = true;
        String guessedLettersStr ="";
        while (checkIfNotUsed) {
            if( !HangmanModel.guessedletters.toString().contains(String.valueOf(letterUppercase))){
                String letterUppercaseStr = Character.toString(letterUppercase);
                HangmanModel.guessedletters.add(letterUppercaseStr);
                guessedLettersStr = String.join(",", HangmanModel.guessedletters);
                HangmanView.print("Used characters: ");
                HangmanView.print(guessedLettersStr);
                checkIfNotUsed = false;
                return letterUppercase;
            }else{
                HangmanView.print("You have already used this letter! ");
                if (guessedLettersStr.equals("")){
                    HangmanView.print(guessedLettersStr);
                }else{
                    HangmanView.print("You have not used letters");
                }
                break;
            }

        }
        return letterUppercase;
    }

    public static String getWord(){
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine().toUpperCase().trim();
        return word;
    }

    public static Integer getInteger(){
        Scanner reader = new Scanner(System.in);
        Integer number = reader.nextInt();
        return number;
    }
}
