import java.io.FileReader;
import java.io.IOException;

public class FileCharacterRead {
    public static void main(String[] args) {

        int ch;
        int count = 0;

        try {
           
            FileReader fr = new FileReader("input.txt");

            // Read file character by character
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
                count++;
            }

            fr.close();

            System.out.println("\n\nTotal number of characters: " + count);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
