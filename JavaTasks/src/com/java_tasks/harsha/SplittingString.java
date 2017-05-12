package com.java_tasks.harsha;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SplittingString {

	public static void main(String args[]) {
		Scanner inputScanner = new Scanner(System.in);
		char choice = 0;
		try
		{
			do {
				inputScanner = new Scanner(System.in);
				System.out.println("Enter input string: ");
				String inputuser = inputScanner.nextLine();
				String[] induvidualWords = inputuser.split(" ");
				String[] compoundwords = new String[induvidualWords.length];
				String compoundWord = "";
				for (int i = 0; i < induvidualWords.length; i++) {
					compoundWord = induvidualWords[0];
					for (int j = 1; j <= i; j++) {
						compoundWord+=" "+induvidualWords[j];
					}
					compoundwords[i] = compoundWord;
				}
				String[] finalarray = new String[induvidualWords.length + induvidualWords.length];
				List<String> list=new ArrayList<String>();
				int count1 = 0;
				int count2 = 0;
				for (int i = 0; i < finalarray.length; i++) {
					if (i % 2 == 0) {
						finalarray[i] = induvidualWords[count1];
						count1++;
					} else {
						finalarray[i] = compoundwords[count2];
						count2++;
					}
				}
				for (int i = 1; i < finalarray.length; i++) {
					for (int j = 0; j <= finalarray[i].length(); j++) {
						if(!list.contains(finalarray[i].substring(0, j)))
						{
							list.add(finalarray[i].substring(0, j));
						}
					}
				}
				Iterator<String> iterator= list.iterator();
				while(iterator.hasNext())
				{
					System.out.println(iterator.next());
				}
				System.out.println("Enter Y if you want to determine how many days back given date and time :");
				choice = inputScanner.next().charAt(0);
			} while (choice=='Y'|| choice=='y');
		}
		catch(Exception e)
		{
			System.out.println(e+" should be handled.");
		}
		finally {
			System.out.println("Exited.");
			inputScanner.close();
		}
	}
}