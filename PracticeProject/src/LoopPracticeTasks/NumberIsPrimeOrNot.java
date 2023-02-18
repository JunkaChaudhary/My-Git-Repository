package LoopPracticeTasks;

import java.util.Scanner;

public class NumberIsPrimeOrNot 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter a Number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int temp =0;
		
		for(int i=2; i<a; i++)
		{
			if(a%i==0)
			{
				temp++;				
			}					
		}
		
		if(temp>0)
		{
			System.out.println("Number is not Prime");
		}
		else
		{
			System.out.println("Number is Prime");
		}				
	}
}
