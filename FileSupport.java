import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadCsv {
    LinkedList<String[]> rows = new LinkedList<String[]>();
    String dataRow = CSVFile.readLine();
    // Read the number of the lines in .csv file
    // i = row of the .csv file
    int i = 0;
    while ((datarow = CSVFile.readLine()) != null){
        i++;
        rows.addLast(dataRow.split(","));
    }

}
