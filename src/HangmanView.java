import java.util.Scanner;

public class HangmanView {
    public static void print(String text){
        System.out.println(text);
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
