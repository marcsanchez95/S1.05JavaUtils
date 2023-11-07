package n1ex02;

import java.io.File;


public class N1ex02 {

	public static void main(String[] args) {		
		String absolutePathSort = new File("").getAbsolutePath();
		ListDirectoryContents2.directorySorterRecursively(absolutePathSort);

	}

}

