import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        String path = "D:\\test_java_files\\testJaveprogram.txt";
        String details = "I am writing in to test file";

        FileReadWrite sample = new FileReadWrite();
        try {
            sample.createFile(path);
            sample.writeFile(details, path);
            sample.readFileContents(path);
        } catch (IOException e) {
            System.out.println("Exception in main method" + e);
            e.printStackTrace();
        }

    }

    public void createFile(String path) {

        try {

            File testFile = new File(path);
            if (testFile.createNewFile()) {
                System.out.println("File created: " + testFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("Exception = " + e);
            e.printStackTrace();
        }

    }

    public void writeFile(String details, String path) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(details);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Io Exception while writing to file= " + e);
            e.printStackTrace();
        }

    }

    public void readFileContents(String path) throws IOException {

        File myObj = new File(path);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);

        }
    }
}
