package question4;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class FileController {
	private String fileName;
	private Scanner reader;
	private PrintWriter writer;
	
	public FileController(String fileName) {
		this.fileName = fileName;
		
		try {
			writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
			reader = new Scanner(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("No such file exists!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error creating the FileWriter");
			e.printStackTrace();
		}
	}
	
	/**
	 * Reads a line from the file
	 * @return
	 */
	public String readLine() {
		if (reader.hasNextLine()) {
			return reader.nextLine();
		} else {
			return null;
		}
	}
	//sure I could overload the readLine method, but why would I need any arguments?
	
	/**
	 * writes a line to the file
	 * @param s
	 */
	public void writeLine(String s) {
		writer.println(s);
		writer.flush();
	}
	/**
	 * Writes a set of Strings to the file. The strings are in an {@link ArrayList}
	 * and will write one element per line
	 * 
	 * @param sList
	 */
	public void writeLine(ArrayList<String> sList) {
		for (String s : sList) {
			writeLine(s);
		}
	}
	
	public void clear() {
		try {
			writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
