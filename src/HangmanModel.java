import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;


public class HangmanModel extends HangmanView{
    Integer life;
    String capital;
    static List<String> guessedLetter;
    char[] guessedWord;
    String wordToGuess;

    public HangmanModel(){
        this.capital = FileSupport.getCapital();
        this.life = 5;
        this.guessedLetter = new ArrayList();
        this.guessedWord= wordToGuess();
        this.wordToGuess = new String(guessedWord);
    }

    public char[] wordToGuess(){
        Integer i = 0;
        char[] charToGuess = new char[this.capital.length()];
        while (i < this.capital.length()){
            charToGuess[i] = '-';  // changing characters to '-'
            if (this.capital.charAt(i) == ' '){  // if there is a capital with ' ' its not changing to '-' but to ' '
                charToGuess[i]= ' ';
            }
            i++;
        }
        return charToGuess;
    }

    public  void guessByLettter(){
        clearScreen();
        printList(this.guessedLetter);
        print(new String(this.guessedWord));
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
            print("Given character is wrong, try again ;) ");
        }
    }

    public void guessByWord(){
        clearScreen();
        printList(this.guessedLetter);
        print(new String(this.guessedWord));
        print("Guess by word:");
        String wordUppercase = HangmanController.getWord();
        if (this.capital.equals(wordUppercase)){
            this.guessedWord = wordUppercase.toCharArray();
        }else{
            this.life--;
            print("Given word is wrong, try again ;)");
        }
    }

    public void playGame(){
        wordToGuess();
        while (life>0){
            printOptions();
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
                            print("Wrong input!");
                    }
                } catch (InputMismatchException e) {
                    print("Type only one number!");
                }
            }
            if (this.capital.equals(String.valueOf(this.guessedWord))){
                print("\n Right capital is "+new String (this.guessedWord));
                print("\n You win! Congratulations!");
                break;
            }
            print("   Life remaining=" + this.life + System.lineSeparator());
        }
        if (life<=0){
            print("You lost!");
        }
    }

    public static void main(String[] args){
        HangmanModel hangman = new HangmanModel();
        hangman.printWelcomeText(5);
        hangman.print(hangman.capital);
        hangman.print(hangman.wordToGuess);
        hangman.playGame();
    }
}
