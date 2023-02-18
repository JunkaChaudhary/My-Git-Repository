package LoopPracticeTasks;

import java.util.Scanner;

public class FactorialOfANumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any number");
		int a = s.nextInt();
		int factorial=1;
		
		for(int i=a; i>=1; i--)
		{
			factorial=factorial*i;
		}
		
		System.out.println("Factorial of the given number is: "+ factorial);
	}
}
