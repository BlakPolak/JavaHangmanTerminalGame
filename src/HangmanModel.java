import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class HangmanModel extends HangmanView{
    Integer life;
    String capital;
    static List<String> guessedletters;
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
            charToGuess[i] = '-';
            if (this.capital.charAt(i) == ' '){
                charToGuess[i]= ' ';
            }
            i++;
        }
        return charToGuess;
    }

    public  void guessByLettter(){
        print("Guess by letter:");
        Character letterUppercase = HangmanController.getChar();
        if (this.capital.contains(letterUppercase+"")){
            for(int j=0; j<this.capital.length(); j++){
                if(this.capital.charAt(j) == letterUppercase)
                    this.guessedWord[j] = letterUppercase;
            }
            print(new String(this.guessedWord));
        }else{
            this.life--;
            print("given character is wrong, try again ;) ");
        }
    }

    public void guessByWord(){
        print("Guess by word:");
        String wordUppercase = HangmanController.getWord();
        if (this.capital.equals(wordUppercase)){
            this.guessedWord = wordUppercase.toCharArray();
        }else{
            this.life--;
            print("given word is wrong, try again ;)");
        }
    }

    public void playGame(){
        wordToGuess();
        while (life>0){
            print(ANSI_PURPLE + "1 => guess by letter" + ANSI_RESET);
            print(ANSI_PURPLE + "2 => guess by word" + ANSI_RESET);
            print(ANSI_PURPLE + "3 => quit"+ ANSI_RESET);
            boolean noInput = true;
            while (noInput) {

                try {
                    Integer option = HangmanController.getInteger();
                    noInput = false;
                    switch (option) {
                        case 1:
                            guessByLettter();
                            break;
                        case 2:
                            guessByWord();
                            break;
                        case 3:
                            print("See you next time!");
                            noInput = false;
                            System.exit(0);
                        default:
                            print("Wrong input");

                    }
                } catch (InputMismatchException e) {
                    print("Type only one number!");

                }

            }
            if (this.capital.equals(String.valueOf(this.guessedWord))){
                print(new String (this.guessedWord));
                print("You win!");
                break;
            }
            print("   Life remaining=" + this.life + System.lineSeparator());
        }
        if (life<=0){
            print("You lost!");
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
        String ANSI_CYAN = "\u001B[36m";
//        String ANSI_WHITE = "\u001B[37m";
        HangmanModel hangman = new HangmanModel();
        hangman.printWelcomeText(5);
        hangman.print(hangman.capital);
        hangman.print(hangman.wordToGuess);
        hangman.playGame();

    }
}
