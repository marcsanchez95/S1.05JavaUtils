package n1ex04;

import java.io.File;



public class N1ex04 {

	public static void main(String[] args) {
		
		String absolutePathSort = new File("").getAbsolutePath();
		String absolutePath = absolutePathSort + "./src/n1ex04/pruebaLeer.txt";
		String outputFilePath = absolutePath;
		String consoleOutput = ListDirectoryContents4.readTextFile(outputFilePath);
		System.out.println(consoleOutput);
	}

}
