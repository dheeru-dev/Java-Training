import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader; //For high performance

public class fileOperations {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis(); // Start timer
        //FileReader fileReader = new FileReader("C:\\Users\\dheer\\IdeaProjects\\Java-Training\\day3\\src\\example.txt");
        FileReader fileReader = new FileReader("example.txt");

        int data;
        //BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\Users\dheer\IdeaProjects\Java-Training\day3\src\example.txt"));
        //String line;
        while ((data = fileReader.read()) != -1) {
            System.out.print((char) data); // Reads character-by-character
        }
        fileReader.close();
        //while ((line = bufferedReader.readLine()) != null) {
        //    System.out.println(line); // Reads entire lines efficiently
        //}
        //bufferedReader.close();
        long endTime = System.currentTimeMillis(); // End timer
        System.out.println("\nFileReader Time Taken: " + (endTime - startTime) + " ms");

    }
}
