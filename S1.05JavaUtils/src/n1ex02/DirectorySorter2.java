package n1ex02;

import java.io.File;
import java.util.Arrays;

public class DirectorySorter2 {
	
	public static void DirectorySort2(String mainDirectory) {
		File carpet = new File(mainDirectory);		
		File[] list = carpet.listFiles();
		


		if (list == null || list.length == 0) {
			System.out.println("No hay elementos dentro de la carpeta actual");
		}
		else {
			for (int i = 0; i < list.length; i++) {
				File archive = list[i];											
				System.out.println(archive.getName());
			
			}			
		}

	}

}
