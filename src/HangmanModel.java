
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
        HangmanView.print("Welcome in Hangman Game");
        Integer life = 5;
        String europe;


////        FileSupport. sciagam liste i
//
//        list.remove(list.size()-1);
//        Integer randomEuropeNumer = Math.random() * europe.length();
//        String word = (String) europe.get(randomEuropeNumer);
//        guess(word, life);
    }
}
