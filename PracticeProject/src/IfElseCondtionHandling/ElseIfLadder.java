package IfElseCondtionHandling;

import java.util.Scanner;

public class ElseIfLadder 
{
	public static void main(String[] args) 
	{
		//int marks;
		System.out.println("Please enter marks:");
		Scanner s = new Scanner(System.in);
		int marks= s.nextInt();
		if(marks>0 && marks<=35)
		{
			System.out.println("Student is Fail. " + marks);
		}
		else if(marks>35 && marks<=60)
		{
			System.out.println("Student is Pass. " + marks);
		}
		else if(marks>60 && marks<=80)
		{
			System.out.println("Student is having 1st Division. " +marks);
		}		
		else if(marks>80 && marks<=100)
		{
			System.out.println("Student has Merit. " +marks);
		}
		else
		{
			System.out.println("Please enter valid marks. " +marks);
		}
		
	}

}
