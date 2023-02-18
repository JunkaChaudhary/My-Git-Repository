package LoopPracticeTasks;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a Number:");
		int a = s.nextInt();
		int temp1 =a, temp2 =a;
		int rem, armsNumber=0, length=0;
		
		while(temp1!=0)
		{
			temp1 = temp1/10;
			length = length+1;
		}	
		System.out.println("length is: " + length);
		
		while(temp2!=0)
		{
			rem =temp2%10;
			int mul=1;
			for(int i=1; i<=length; i++)
			{
				mul = mul*rem;
			}
			armsNumber = armsNumber +mul;
			temp2 = temp2/10;
		}
		
		if(a==armsNumber)
		{
			System.out.println("Entered Number is an Armstrong number");
		}
		else
		{
			System.out.println("Entered Number is not an Armstrong number");
		}
	}
}
