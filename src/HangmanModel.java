import java.util.InputMismatchException;
import java.util.List;
import java.lang.Exception;

public class HangmanModel {
    Integer life;
    String capital;

    public HangmanModel(){
        this.capital = FileSupport.getCapital();
        this.life = 5;
    }
    public void wordToGuess(){
        Integer i = 0;
        char[] charToGuess = new char[this.capital.length()];
        while (i < this.capital.length()){
            charToGuess[i] = '-';
            if (this.capital.charAt(i) == ' '){
                charToGuess[i]= ' ';
            }
            i++;
        }
        String wordToGuess = new String(charToGuess);
        HangmanView.print(wordToGuess);
    }
    public static void guessByLettter(String capital, Integer life){
        HangmanView.print("Guess by letter:");
//        String s1 = capital;
//        String sinput = HangmanView.takeInput();
//        String s2 = public String toUpperCase(sinput)
//        HangmanView.print("Enter a word:");
//        HangmanController.getInput();
//        try {
//            System.out.println(tab[index]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
//        }
//
//
//        if (s1.equals(s2)) {
//            System.out.println("Great answer ");
//        } else {
//            System.out.println("Try again");
//        }
//

    }
    public static void guessByWord(String capital, Integer life){
//        String s1 = capital;
//        String sinput = HangmanView.takeInput();
//        String s2 = public String toUpperCase(sinput)
//        HangmanView.print("Enter a word:");
//        HangmanController.getInput();
//        try {
//            System.out.println(tab[index]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
//        }
//
//
//        if (s1.equals(s2)) {
//            System.out.println("Great answer ");
//        } else {
//            System.out.println("Try again");
//        }
//

    }

    public void letterOrWord(){
        HangmanView.print("1 => guess by letter");
        HangmanView.print("2 => guess by word");
        HangmanView.print("3 => quit");
        boolean noInput = true;
        while (noInput) {
            try {
                Integer option = HangmanController.getInteger();
                noInput = false;
                System.out.println(option);
                switch (option) {
                    case 1:
                        System.out.println("in 1");
                        wordToGuess();
                        guessByLettter(this.capital, this.life);
                    case 2:
                        System.out.println("in 2");
                        wordToGuess();
                        guessByWord(this.capital, this.life);
                    case 3:
                        System.out.println("quit");
                        break;
                    default:
                        HangmanView.print("Wrong input");
                }
            } catch (InputMismatchException e) {
                HangmanView.print("Type only one number!");

            }
        }
    }


    public static void main(String[] args){
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
//        String ANSI_BLACK = "\u001B[30m";
        String ANSI_GREEN = "\u001B[32m";
//        String ANSI_YELLOW = "\u001B[33m";
//        String ANSI_BLUE = "\u001B[34m";
//        String ANSI_PURPLE = "\u001B[35m";
//        String ANSI_CYAN = "\u001B[36m";
//        String ANSI_WHITE = "\u001B[37m";
        HangmanModel hangman = new HangmanModel();
        HangmanView.print(ANSI_RED + "Welcome in Hangman Game" + ANSI_RESET );
        HangmanView.print(ANSI_GREEN  + "        Lifes: "  + hangman.life + ANSI_RESET );


        hangman.capital = FileSupport.getCapital();

        HangmanView.print(hangman.capital);
        hangman.letterOrWord();

    }
}
