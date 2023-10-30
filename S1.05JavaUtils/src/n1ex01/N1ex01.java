package n1ex01;

import java.io.File;

public class N1ex01 {

	public static void main(String[] args) {
		//cambiar el directori per un valid si cal.
		String absolutePathSort = new File(".\\src").getAbsolutePath();
		ListDirectoryContents.DirectorySort(absolutePathSort);
	}
}
