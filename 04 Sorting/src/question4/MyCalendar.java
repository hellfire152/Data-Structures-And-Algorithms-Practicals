/*===================================================================
Program Name:	MyCalendar.java
Description:	A class to perform date functions
Done by:		Phoon Lee Kien
Admin No:		001234A
Module Group:	IT1204-99
=====================================================================*/
package question4;
import java.util.*;

public class MyCalendar {

	// Get the number of days for first date minus second date
	public static long getDifference(GregorianCalendar d1, GregorianCalendar d2) {

		long firstDate = d1.getTimeInMillis();
		long secDate = d2.getTimeInMillis();

		return (firstDate - secDate) / (24 * 60 * 60 * 1000);
	}

	public static String formatDate(GregorianCalendar d1) {
		int day = d1.get(Calendar.DATE);
		int month = d1.get(Calendar.MONTH) + 1;
		int year = d1.get(Calendar.YEAR);
		return day + "/" + month + "/" + year;
	}

	public static GregorianCalendar convertDate(String date) {
		int day, month, year;
		StringTokenizer tokenizer = new StringTokenizer(date, "/");
		day = Integer.parseInt(tokenizer.nextToken());
		month = Integer.parseInt(tokenizer.nextToken());
		year = Integer.parseInt(tokenizer.nextToken());
		return new GregorianCalendar(year, month - 1, day);
	}

	public static void main(String args[]) {

		GregorianCalendar d1 = new GregorianCalendar(2003, 1, 20);
		GregorianCalendar d2 = new GregorianCalendar(2003, 0, 16);
		System.out.println("First Date = " + MyCalendar.formatDate(d1));
		System.out.println("Second Date = " + MyCalendar.formatDate(d2));
		long days = MyCalendar.getDifference(d1, d2);
		System.out.println("Difference in Days = " + days);

		GregorianCalendar d3 = MyCalendar.convertDate("02/04/2009");
		System.out.println("Third Date = " + MyCalendar.formatDate(d3));

	}
}
