package question3;
//==============================================================
//Program Name:	ReadFile.java 
// Description:	This program demonstrates the use of file input stream
// Author:		Losl
// Admin No:	001234A
// MG#:			IT1204-99
//==============================================================

import java.io.*;
import java.util.*;

public class ReadFile{
   //-----------------------------------------------------------
   //  Reads data from an input file then prints them. 
   //-----------------------------------------------------------
   public static void main (String[] args){

      String file = "output.txt";
      String line = "";

      try{
         FileReader fr = new FileReader (file);
         Scanner sc = new Scanner(fr);

		 //read in the file line by line
         while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
         }

         fr.close();
      }
      catch (FileNotFoundException exception){
         System.out.println ("The file " + file + " was not found.");
      }
      catch (IOException exception){
         System.out.println (exception);
      }
   }
}
