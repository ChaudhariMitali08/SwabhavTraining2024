import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingTest {
    public static void main(String[] args) {
        try {
            // Correctly initialize FileReader
            FileReader fileReader = new FileReader("D:\\AurionPro\\07_Streams\\src\\MYFILE");
            BufferedReader br = new BufferedReader(fileReader);

            String currLine = br.readLine();
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            while (currLine != null) {
                lineCount++;

                // Split the line into words using space as delimiter
                String[] words = currLine.split("\\s+");
                wordCount += words.length;

                // Count characters in the current line
                for (String word : words) {
                    charCount += word.length();
                }

                // Read the next line
                currLine = br.readLine();
            }

            System.out.println("Total line count = " + lineCount);
            System.out.println("Total word count = " + wordCount);
            System.out.println("Total char count = " + charCount);

            // Close the BufferedReader
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
