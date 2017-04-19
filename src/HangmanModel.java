import java.util.List;
public class HangmanModel {

    public static void guess(String capital, Integer life){
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
    public static void letterOrWord(){

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
        Integer life = 5;
        String capital;
        HangmanView.print(ANSI_RED + "Welcome in Hangman Game" + ANSI_RESET );
        HangmanView.print(ANSI_GREEN  + "        Lifes: "  + life + ANSI_RESET );


        capital = FileSupport.getCapital();

        System.out.println(capital);
        letterOrWord();
    }
}
