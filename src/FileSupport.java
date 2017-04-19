import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class FileSupport {
    public static List openFile() throws FileNotFoundException {
        // TODO code application logic here

        // // read KeyWestTemp.txt

        // create token1
        String token1 = "";

        // for-each loop for calculating heat index of May - October

        // create Scanner inFile1
        Scanner inFile1 = new Scanner(new File("/home/ppolak/Desktop/JavaProjects/javahangmangame-bexpe/src/europecapitals.txt")).useDelimiter(",\\s*");
        // Original answer used LinkedList, but probably preferable to use ArrayList in most cases
        // List<String> temps = new LinkedList<String>();
        List<String> temps = new ArrayList<String>();

        // while loop
        while (inFile1.hasNext()) {
            // find next line
            token1 = inFile1.next();
            temps.add(token1);
        }
        inFile1.close();
//        String[] tempsArray = temps.toArray(new String[0]);
//
        for (String s : temps) {
            System.out.println(s);
        }
    return temps;
    }
}

