package question3;
//==============================================================
//Program Name:	WriteFile.java 
// Description:	This program demonstrates the use of file output stream
// Author:		Losl	
// Admin No:	001234A
// MG#:			IT1204-99
//==============================================================

import java.io.*;

public class WriteFile{

   public static void main (String[] args){
      String file="output.txt";

      try{
      	//create the PrintWriter
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);

		//write value out to the file
		outFile.println("Coke is nice");
		outFile.println("Diet Coke is even better cos won't put on weight =)");
		
		//close the file
		outFile.close();
		
		System.out.println("File created: " + file);
      }
      catch (IOException exception){
         System.out.println (exception);
      }
   }
}
