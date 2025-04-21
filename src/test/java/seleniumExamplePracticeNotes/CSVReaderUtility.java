package seleniumExamplePracticeNotes;



import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.ui.pojos.User;

public class CSVReaderUtility {

    public static Iterator<User> readCSVFile(String fileName) {
        List<User> userList = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("testData/" + fileName))) {
            reader.readNext(); // skip header
            String[] line;
            while ((line = reader.readNext()) != null) {
                userList.add(new User(line[0], line[1]));
            }
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException("Error reading CSV: " + e.getMessage(), e);
        }
        return userList.iterator();
    }
}
