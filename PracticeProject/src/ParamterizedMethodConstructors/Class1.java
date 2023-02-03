package ParamterizedMethodConstructors;

public class Class1 {		
	public void m1()
	{
		this.m5(10,20,30,40);
		System.out.println("Default method.");
		this.m2(100);
		this.m4(1000,2000,3000);
		this.m3(1,2);
	}
	
	public void m2(int a1)
	{
		System.out.println("One parameterized method.");
	}
	
	public void m3(int a1, int a2)
	{
		System.out.println("Two parameterized method.");
	}
	
	public void m4(int a1, int a2, int a3)
	{
		System.out.println("Three parameterized method.");
	}
	
	public void m5(int a1, int a2, int a3, int a4)
	{
		System.out.println("Four parameterized method.");
	}
	
	public static void main(String[] args) {
		Class1 obj1= new Class1();
		obj1.m1();
	}
}
