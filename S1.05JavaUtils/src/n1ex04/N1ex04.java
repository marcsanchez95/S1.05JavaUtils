package n1ex04;

public class N1ex04 {

	public static void main(String[] args) {
				
		ListDirectoryContents4.directorySorterRecursively(
				"D:\\Games\\The Medium");
		
		String outputFilePath = "C:\\Users\\marcs\\git\\S1.05JavaUtils\\S1.05JavaUtils\\src\\n1ex04\\pruebaLeer.txt";
		String consoleOutput = ListDirectoryContents4.readTextFile(outputFilePath);
		System.out.println(consoleOutput);
	}

}
