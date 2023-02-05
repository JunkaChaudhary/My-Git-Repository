package Polymorphism;

public class ClassA 
{
	public int m1(int a, int b)
	{
		int c;
		c = a+b;
		System.out.println("1st Result is: " + c);
		return c;
	}
	
	public void m1(float a, int b, int c)  //method overloading- input data types can't be same.
	{
		float d;
		d = a+b+c;
		System.out.println("2nd Result is: " + d);
	}
	
	public static void main(String[] args) 
	{
		ClassA obj = new ClassA();
		
	}
}
