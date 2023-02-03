package Inheritance;

public class SuzukiVDI extends Suzuki{
	
	public void m3() 
	{
	System.out.println("I am child class method");	
	}
	
	public static void main(String[] args) {
		SuzukiVDI obj = new SuzukiVDI();
		
		obj.a=120;
		obj.m1();
		obj.m2();
		obj.m3();
		
		System.out.println("Value of a is: " + obj.a);
	}

}
