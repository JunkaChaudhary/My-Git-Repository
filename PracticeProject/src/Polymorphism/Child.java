package Polymorphism;

public class Child extends Parent
{
	public void arithmatic(int a, int b)
	{
		int c;
		c = a-b;
		System.out.println("Parent method result is: " + c);
	}
	
	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.arithmatic(30, 20);
	}

}
