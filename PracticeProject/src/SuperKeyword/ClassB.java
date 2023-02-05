package SuperKeyword;

public class ClassB extends ClassA
{
	public void m1()
	{
		System.out.println("Child default method.");
	}
	
	public void m2(int a)
	{
		System.out.println("Child 1 parameterized method.");
	}
	
	public void m3(int a, int b)
	{
		super.m1();
		super.m3(1,2);
		super.m2(2);
		super.m4(1,2,3);
		System.out.println("Child 2 parameterized method.");
	}
	
	public void m4(int a, int b, int c)
	{
		this.m3(1,2);
		this.m1();
		this.m2(1);
		System.out.println("Child 3 parameterized method.");
	}
	
	public static void main(String[] args) 
	{
		ClassB obj = new ClassB();
		obj.m4(1,2,3);
		
	}

}
