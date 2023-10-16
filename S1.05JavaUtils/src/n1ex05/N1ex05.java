package n1ex05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class N1ex05 {

	public static void main(String[] args) {

		ListDirectoryContents5.directorySorterRecursively(
				"D:\\Games\\The Medium");

		String outputFilePath = "C:\\Users\\marcs\\git\\S1.05JavaUtils\\S1.05JavaUtils\\src\\n1ex04\\pruebaLeer.txt";
		String consoleOutput = ListDirectoryContents5.readTextFile(outputFilePath);
		System.out.println(consoleOutput);
		
		SerExampleCar ferrari = new SerExampleCar("Ferrari","Huracan",500);
		//prova i implementacio de serializar i deserialitzar objectes.
		serializeObject(ferrari, "C:\\Users\\marcs\\git\\S1.05JavaUtils\\S1.05JavaUtils\\src\\n1ex05\\ferrari.ser");
		SerExampleCar deserializedFerrari = (SerExampleCar) deserializeObject("C:\\Users\\marcs\\git\\S1.05JavaUtils\\S1.05JavaUtils\\src\\n1ex05\\ferrari.ser");
		System.out.println("Deserialized the car: "+deserializedFerrari.getBrand() +" "+ deserializedFerrari.getModel());
	
	}
	   public static void serializeObject(Object object, String filePath) {
	        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
	            outputStream.writeObject(object);
	            System.out.println("Object serialized and saved to: " + filePath);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }   

		public static Object deserializeObject(String filePath) {

			try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
				Object object = inputStream.readObject();
				System.out.println("Object deserialized from: " + filePath);
				return object;
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		}
	}
