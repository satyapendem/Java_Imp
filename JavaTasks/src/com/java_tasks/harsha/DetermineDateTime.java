package com.java_tasks.harsha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DetermineDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String dateAndTime;
		char choice;
		try {
			do {
				input = new Scanner(System.in);
				System.out.println("Enter date and time in the format of DD MM YYYY hh:mm:SS AM/PM :");
				dateAndTime = input.nextLine();
				/* System.out.println(dateAndTime); */
				SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy hh:mm:ss a");
				Date userGivenDate = null;
				try {
					userGivenDate = formatter.parse(dateAndTime);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					System.out.println("Enter specified format of date.");
				}
				try {
					if (dateAndTime.equals(formatter.format(userGivenDate))) {
						/* System.out.println("TRUE"); */
						Date today = new Date();
						try {
							userGivenDate = formatter.parse(dateAndTime);
							long differenceBetweenDates = today.getTime() - userGivenDate.getTime();
							/*
							 * System.out.println("DIFF: " +
							 * differenceBetweenDates);
							 */
							long differenceBetweenNoOfDays = differenceBetweenDates / (24 * 60 * 60 * 1000);
							// System.out.println("Days:
							// "+differenceBetweenNoOfDays);
							if (differenceBetweenNoOfDays > 0 && differenceBetweenNoOfDays < 1) {
								System.out.println("Tomorrow");
							} else if (differenceBetweenNoOfDays < 0) {
								System.out.println("In Future");
							} else if (differenceBetweenNoOfDays == 1) {
								System.out.println("Yesterday");
							} else if (differenceBetweenNoOfDays > 1) {
								formatter = new SimpleDateFormat("E, dd MMM yyyy hh:mm:ss a");
								dateAndTime = formatter.format(userGivenDate);
								System.out.println(dateAndTime);
							} else {
								System.out.println("Today");
							}
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						System.out.println("Enter specified Format DD MM YYYY HH:mm:ss AM/PM");
					}
				} catch (NullPointerException nullPointerException) {
					System.out.println("The Specified Format is DD MM YYYY HH:mm:ss AM/PM");
				} finally {
					System.out.println("Enter Y if you want to determine how many days back given date and time :");
					choice = input.next().charAt(0);
				}
			} while (choice == 'Y' || choice == 'y');
			input.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Exited.");
	}
}