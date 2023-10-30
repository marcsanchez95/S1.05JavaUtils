package n1ex03;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class N1ex03 {

	public static void main(String[] args) {
		String absolutePathSort = new File(".\\src").getAbsolutePath();
		String outputFile = ".\\src\\n1ex03\\result.txt";

		List<String> allArchives = new ArrayList<>();

		ListDirectoryContents3.directorySorterRecursively(absolutePathSort, allArchives);
		ListDirectoryContents3.writeText(allArchives, outputFile);

	}
}