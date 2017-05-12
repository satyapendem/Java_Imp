package com.java_tasks.harsha;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner= new Scanner(System.in);
		char choice = 0;
		try
		{
			do {
				inputScanner = new Scanner(System.in);
				System.out.println("Enter the input String: ");
				String inputString,appendString="";
				inputString=inputScanner.nextLine();
				String[] inputStringArray=inputString.split(" ");
				String[] outputStringArray=new String[inputStringArray.length+inputStringArray.length];
				for(int i=0;i<inputStringArray.length;i++)
				{
					for(int j=0;j<inputStringArray[i].length();j++)
					{
						appendString+=inputStringArray[i].charAt(j);
						System.out.println(appendString);
					}
				}
				System.out.println("Enter Y if you want to split another string :");
				choice = inputScanner.next().charAt(0);
			} while (choice=='Y'||choice=='y');
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Exited.");
			inputScanner.close();
		}
	}

}
