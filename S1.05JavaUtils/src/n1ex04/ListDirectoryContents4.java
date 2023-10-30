package n1ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListDirectoryContents4 {

    public static void directorySorterRecursively(String inputDirectoryPath) {
        Path directory = Paths.get(inputDirectoryPath);
        listContentsRecursively(directory, 0);
    }

    private static void listContentsRecursively(Path directory, int depth) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory)) {
            for (Path entry : stream) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < depth; i++) {
                    result.append("  ");
                }

                if (Files.isDirectory(entry)) {
                    result.append("D  ");
                } else {
                    result.append("F  ");
                }

                result.append(entry.getFileName());
                result.append(" (Last Modified: " + Files.getLastModifiedTime(entry) + ")");
                System.out.println(result.toString());

                if (Files.isDirectory(entry)) {
                    listContentsRecursively(entry, depth + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while listing the directory: " + e.getMessage());
        }
    }

    public static void writeText(List<String> allArchives, String outputFile) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile), StandardOpenOption.CREATE,
                StandardOpenOption.APPEND)) {
            System.out.println("Pathing content:");
            for (int i = allArchives.size() - 1; i >= 0; i--) {
                String line = allArchives.get(i);
                writer.write(line);
                writer.newLine();
            }
            System.out.println("The data was successfully written to the file");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static String readTextFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        return content.toString();
    }

    public static class FileComparator implements Comparator<String> {
        @Override
        public int compare(String file1, String file2) {
            return file1.compareTo(file2);
        }
    }
}
