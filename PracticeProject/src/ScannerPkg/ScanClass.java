package ScannerPkg;

import java.util.Scanner;
public class ScanClass 
{
	public int sum(int a, int b) 
	{
		return a+b;
	}
	public int sub(int a, int b) 
	{
		return a-b;
	}
	public int mul(int a, int b) 
	{
		return a*b;
	}
	public int div(int a, int b) 
	{
		return a/b;
	}
	public static void main(String[] args) {
		ScanClass obj= new ScanClass();
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value of x1:");
		int x1=s.nextInt();
		System.out.println("Enter value of x2:");
		int x2=s.nextInt();
		System.out.println("Enter value of x3:");
		int x3=s.nextInt();
		System.out.println("Enter value of x4:");
		int x4=s.nextInt();
		System.out.println("Enter value of x5:");
		int x5=s.nextInt();
		System.out.println("Enter value of x6:");
		int x6=s.nextInt();		
		int sumResult= obj.sum(x1, x2);
		int sumResult2= obj.sum(sumResult, x3);
		int subResult= obj.sub(sumResult2, x4);
		int divResult= obj.div(subResult, x5);
		int mulResult= obj.mul(divResult, x6);
		
		System.out.println("Final Result is: " + mulResult);
		}
}
