package n1ex02;

import java.io.File;


public class N1ex02 {

	public static void main(String[] args) {
		// cambiar el directori per un valid.
		String absolutePathSort = new File(".\\src").getAbsolutePath();
		ListDirectoryContents2.directorySorterRecursively(absolutePathSort);

	}

}

