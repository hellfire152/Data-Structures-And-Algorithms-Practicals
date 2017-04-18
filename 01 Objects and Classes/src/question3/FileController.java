package question3;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileController {
	private String fileName;
	Scanner reader;
	PrintWriter writer;
	
	//part b(i)
	public FileController(String fileName) {
		this.fileName = fileName;
		
		try {
			reader = new Scanner(new FileReader(fileName));
			writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
		} catch (FileNotFoundException e) {
			System.out.println("No such file exists!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error creating the FileWriter");
			e.printStackTrace();
		}
	}
	
	//part b(ii)
	public String readLine() {
		if (reader.hasNextLine()) {
			return reader.nextLine();
		} else {
			return null;
		}
	}
	
	//part b(iii)
	public void writeLine(String s) {
		writer.println(s);
		writer.flush();
	}
	
	public static void main(String[] args) {
		FileController f = new FileController("student.txt");
		System.out.println(f.readLine());
	}
}
