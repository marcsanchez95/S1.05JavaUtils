package n1ex01;

import java.io.File;

public class N1ex01 {

	public static void main(String[] args) {
		String absolutePathSort = new File("").getAbsolutePath();
		ListDirectoryContents.DirectorySort(absolutePathSort);
	}
}
