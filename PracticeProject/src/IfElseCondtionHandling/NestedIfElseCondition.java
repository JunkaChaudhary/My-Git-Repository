package IfElseCondtionHandling;

import java.util.Scanner;

public class NestedIfElseCondition 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter marks:");
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		if(a>0)
		{
			if(a%2==0)
			{
				System.out.println("Number is even.");
			}
			else
			{
				System.out.println("Number is odd.");
			}
		}
		else
		{
			System.out.println("Number is odd.");
		}
	}
}
