package LoopPracticeTasks;

import java.util.Scanner;

public class PrintTable 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any number");
		int a = s.nextInt();
		int table;
		System.out.println("Table Data is:");
		
		for(int i=1; i<=10; i++)
		{
			//table= a*i;
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
}
