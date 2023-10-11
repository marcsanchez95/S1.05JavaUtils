package n1ex01;

import java.io.File;
import java.util.Arrays;

public class DirectorySorter {

	public static void DirectorySort(String mainDirectory) {
		
		File directory = new File(mainDirectory);
		String[] list = directory.list();
		Arrays.sort(list);
		
		if (list == null || list.length == 0) {
			System.out.println("empty carpet");
		}
		else {
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
		}

	}

}	
