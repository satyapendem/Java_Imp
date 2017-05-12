package com.java_tasks.harsha;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		scanner.close();
		int a,b,c;
		b=10;
		a=b=c=20;
		System.out.println(a);
	}

}
