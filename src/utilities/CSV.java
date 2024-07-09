package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    // This function will read data from a CSV file and return it as a list
    public static List<String[]> read(String file) {
        List<String[]> data = new LinkedList<String[]>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            for (String line : br.lines().toList()) {
                data.add(line.split(","));
            }

            return data;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
