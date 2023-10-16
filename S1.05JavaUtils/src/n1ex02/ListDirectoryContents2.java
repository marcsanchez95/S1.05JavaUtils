package n1ex02;



import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class ListDirectoryContents2 {

	    public static void directorySorterRecursively(String inputDirectoryPath) {
	        Path directory = Paths.get(inputDirectoryPath);
	        listContentsRecursively(directory, 0);
	    }

	    private static List<String> listContentsRecursively(Path directory, int depth) {
	        List<String> allArchives = new ArrayList<>();

	        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory)) {
	            List<Path> subDirectories = new ArrayList<>();
	            
	            for (Path entry : stream) {
	                StringBuilder result = new StringBuilder();
	                for (int i = 0; i < depth; i++) {
	                    result.append("  ");
	                }

	                if (Files.isDirectory(entry)) {
	                    result.append("D  ");
	                    subDirectories.add(entry);
	                } else {
	                    result.append("F  ");
	                }

	                result.append(entry.getFileName());
	                result.append(" (Last Modified: " + Files.getLastModifiedTime(entry) + ")");
	                allArchives.add(result.toString());
	            }
	         
	            allArchives.sort(new FileComparator());
	         
	            for (String archive : allArchives) {
	                System.out.println(archive);
	            }
	          
	            for (Path subDir : subDirectories) {
	                listContentsRecursively(subDir, depth + 1);
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while listing the directory: " + e.getMessage());
	        }
	        return allArchives;
	    }

	    public static class FileComparator implements Comparator<String> {
	        @Override
	        public int compare(String file1, String file2) {
	            return file1.compareTo(file2);
	        }
	    }
	}
