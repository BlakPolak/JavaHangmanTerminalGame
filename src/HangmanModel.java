import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class HangmanModel {
    Integer life;
    String capital;
    static List<String> guessedletters; // wszystkie ktore zgadywal nawet niepoprawne, printowanie na ekranie
    char[] guessedWord;
    char[] charToGuess;
    String wordToGuess;

    public HangmanModel(){
        this.capital = FileSupport.getCapital();
        this.life = 5;
        this.guessedletters = new ArrayList();
        this.guessedWord= wordToGuess();
        this.wordToGuess = new String(guessedWord);
    }

    public char[] wordToGuess(){
        Integer i = 0;
        char[] charToGuess = new char[this.capital.length()];
        while (i < this.capital.length()){
            charToGuess[i] = '-';  // changing characters to '-'
            if (this.capital.charAt(i) == ' '){  // if there is a capital with ' ' its not chanaging to '-' but to ' '
                charToGuess[i]= ' ';
            }
            i++; // going to next char
        }
        return charToGuess;
    }
    public  void guessByLettter(){
        HangmanView.print(new String (this.guessedWord));
        HangmanView.print("Guess by letter:");
        Character letterUppercase = HangmanController.getChar();
        if (this.capital.contains(letterUppercase+"")){
            for(int j=0; j<this.capital.length(); j++){
                if(this.capital.charAt(j) == letterUppercase)
                    this.guessedWord[j] = letterUppercase;
            }
            HangmanView.print(new String (this.guessedWord));
        }else{
            this.life--;
        }
    }
    public void guessByWord(){


    }

    public void playGame(){
        wordToGuess();
        while (life>0){
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
                            guessByLettter();
                            break;
                        case 2:
                            System.out.println("in 2");
                            guessByWord();
                            break;
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
            if (this.capital.equals(String.valueOf(this.guessedWord))){
                HangmanView.print(new String (this.guessedWord));
                HangmanView.print("You win!");
                break;
            }
            HangmanView.print("   Life remaining=" + this.life);
        }
        if (life<=0){
            HangmanView.print("You lost!");
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

        HangmanView.print(hangman.capital);
        HangmanView.print(hangman.wordToGuess);
        hangman.playGame();

    }
}
