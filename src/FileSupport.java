
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

class FileSupport {
    public static void main(String[] args) {
        System.out.println(getCapital());
    }

  static String getCapital() {
    String capital = "";
    try {
      Random random = new Random();
      String content = new String(Files.readAllBytes(Paths.get("javahangmangame-bexpe/europecapitals.txt")));
      List<String> capitals = new ArrayList<String>(Arrays.asList(content.split("\\s+")));
      int index = random.nextInt(capitals.size());
      capital = capitals.get(index).toUpperCase();
      capitals.remove(index);

    } catch(IOException ioe) {
      System.out.println("Error reading file");
      ioe.printStackTrace();

    }
    return capital;
  }
}

