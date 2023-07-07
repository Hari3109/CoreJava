package oopsExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
public static void main(String[] args) {
	try {
		readFile("notes-Day1.txt");
			
	}catch(FileNotFoundException e) {
		System.out.println("error:"+e.getMessage());
	}
}
	public static void readFile(String fileName) throws FileNotFoundException{
		File file=new File(fileName);
		Scanner sca=new Scanner(file);
		while(sca.hasNextLine()) {
			String line=sca.nextLine();
			System.out.println(line);
		}
		sca.close();
	}

}
