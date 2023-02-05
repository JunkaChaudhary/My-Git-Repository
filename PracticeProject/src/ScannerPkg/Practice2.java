package ScannerPkg;

//(((((x1*x2)-x3)+x4)-x5)/x6)

import java.util.Scanner;
public class Practice2 
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
		Practice2 obj1= new Practice2();
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
		int mulResult= obj1.mul(x1, x2);
		int subResult= obj1.sub(mulResult, x3);
		int sumResult= obj1.sum(subResult, x4);
		int subResult2= obj1.sub(sumResult, x5);
		int divResult= obj1.div(subResult2, x6);
		
		System.out.println("Final Result is " + divResult);
		}

}
