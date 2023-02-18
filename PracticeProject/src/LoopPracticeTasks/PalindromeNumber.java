package LoopPracticeTasks;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a Number:");
		int a = s.nextInt();
		int org_num =a;
		int rem, rev_num=0;
		
		while(a!=0)
		{
			rem= a%10;
			rev_num= (rev_num*10) + rem;
			a = a/10;			
		}
		
		if(org_num==rev_num)
		{
			System.out.println("Number is Palindrome: " + rev_num);
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}

}
