
public class HangmanView  {
    String ANSI_RED;
    String ANSI_RESET;
    //        String ANSI_BLACK = "\u001B[30m";
    String ANSI_GREEN;
    //        String ANSI_YELLOW = "\u001B[33m";
//        String ANSI_BLUE = "\u001B[34m";
    String ANSI_PURPLE;
    String ANSI_CYAN;
//        String ANSI_WHITE = "\u001B[37m";
    public HangmanView(){
        this.ANSI_GREEN = "\u001B[32m";
        this.ANSI_RED = "\u001B[31m";
        this.ANSI_RESET = "\u001B[0m";
        this.ANSI_CYAN = "\u001B[36m";
        this.ANSI_PURPLE ="\u001B[35m";
    }
    public void printWelcomeText(Integer life){
        System.out.println(ANSI_RED+ "Welcome in Hangman Game" +ANSI_RESET );
        System.out.println(ANSI_GREEN  + "     You have: "  + ANSI_CYAN + life +  ANSI_GREEN +" lifes.\n     So be focused!" + ANSI_RESET );
    }
    public static void print(String text){
        System.out.println(text);
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
