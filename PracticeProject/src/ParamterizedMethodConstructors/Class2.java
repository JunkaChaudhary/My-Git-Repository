package ParamterizedMethodConstructors;

public class Class2 {
	
	public Class2()
	{
		this(10,20,30);
		System.out.println("Default Constructor.");
	}
	
	public Class2(int a1)
	{
		this();
		System.out.println("One parameterized Constructor.");
	}
	
	public Class2(int a1, int a2)
	{
		this(10,20,30,40);
		System.out.println("Two parameterized Constructor.");
	}
	
	public Class2(int a1, int a2, int a3)
	{
		System.out.println("Three parameterized Constructor.");
	}
	
	public Class2(int a1, int a2, int a3, int a4)
	{
		this(11);
		System.out.println("Four parameterized Constructor.");
	}
	
	public static void main(String[] args) {
		Class2 obj1= new Class2(10,20);
	}
}