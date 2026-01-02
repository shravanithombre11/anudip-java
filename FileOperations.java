import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {

        try {
            // 1️⃣ Create File
            File file = new File("demo.txt");
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }

            // 2️⃣ Write to File
            FileWriter writer = new FileWriter(file);
            writer.write("Hello Java File Handling\n");
            writer.write("This is first write operation");
            writer.close();
            System.out.println("Data written to file");

            // 3️⃣ Append to File
            FileWriter appendWriter = new FileWriter(file, true);
            appendWriter.write("\nThis line is appended");
            appendWriter.close();
            System.out.println("Data appended");

            // 4️⃣ Read from File
            Scanner reader = new Scanner(file);
            System.out.println("\nReading file content:");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

            // 5️⃣ File Properties
            System.out.println("\nFile Properties:");
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size: " + file.length() + " bytes");

            // 6️⃣ Rename File
            File newFile = new File("renamed_demo.txt");
            if (file.renameTo(newFile)) {
                System.out.println("File renamed successfully");
            } else {
                System.out.println("Rename failed");
            }

            // 7️⃣ Delete File
            if (newFile.delete()) {
                System.out.println("File deleted");
            } else {
                System.out.println("Delete failed");
            }

        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
