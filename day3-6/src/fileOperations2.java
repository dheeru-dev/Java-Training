import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileOperations2 {
    public static void main(String[] args) throws IOException {

        Path directory = Paths.get("stock_data");

        try {
            if (!Files.exists(directory)) {
                Files.createDirectories(directory);
                System.out.println(" Directory created: " + directory.toAbsolutePath());
            } else {
                System.out.println(" Directory already exists: " + directory.toAbsolutePath());
            }
        } catch (Exception e) {
            System.err.println(" Error creating directory: " + e.getMessage());
        }
        Path source = Paths.get("stocks.txt");
        Path destination = Paths.get("stocks_copy.txt");
        try (FileChannel sourceChannel = FileChannel.open(source, StandardOpenOption.READ);
             FileChannel destinationChannel = FileChannel.open(destination, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            long size = sourceChannel.size(); // Get file size for progress tracking
            long copiedBytes = 0;
            long chunkSize = 1024 * 10; // Copy in chunks (10KB)
            while (copiedBytes < size) {
                long remaining = size - copiedBytes;
                long bytesTransferred = sourceChannel.transferTo(copiedBytes, Math.min(chunkSize, remaining), destinationChannel);
                copiedBytes += bytesTransferred;
                // Display progress percentage
                double progress = (copiedBytes / (double) size) * 100;
                System.out.printf("\r Copying: %.2f%% complete", progress);
            }
            System.out.println("\n Copy completed successfully!");
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }

    }
}