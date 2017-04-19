import java.util.List;
public class HangmanModel {

    public static void guess(String word, Integer life){
        String s1 = word;
        String sinput = HangmanView.takeInput();
        String s2 = public String toUpperCase(sinput)
        HangmanView.print("Enter a word:");
        HangmanController.getInput();
        try {
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
        }


        if (s1.equals(s2)) {
            System.out.println("Great answer ");
        } else {
            System.out.println("Try again");
        }

    }

    public static void main(String[] args){
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
//        String ANSI_BLACK = "\u001B[30m";
//        String ANSI_GREEN = "\u001B[32m";
//        String ANSI_YELLOW = "\u001B[33m";
//        String ANSI_BLUE = "\u001B[34m";
//        String ANSI_PURPLE = "\u001B[35m";
//        String ANSI_CYAN = "\u001B[36m";
//        String ANSI_WHITE = "\u001B[37m";

        HangmanView.print(ANSI_RED + "Welcome in Hangman Game" + ANSI_RESET );
        Integer life = 5;
        List europe;
        europe = FileSupport.openFile();


////        FileSupport. sciagam liste i
//
//        list.remove(list.size()-1);
//        Integer randomEuropeNumer = Math.random() * europe.length();
//        String word = (String) europe.get(randomEuropeNumer);
//        guess(word, life);
    }
}
