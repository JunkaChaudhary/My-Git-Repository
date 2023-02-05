package SuperKeyword;

public class Parent {
	
	public Parent()
	{
		this(2,3,4);
		System.out.println("Parent default constructor.");
	}
	
	public Parent(int a)
	{
		this();
		System.out.println("Parent 1 parameterized constructor.");
	}
	
	public Parent(int a, int b)
	{
		this(10);
		System.out.println("Parent 2 parameterized constructor.");
	}

	public Parent(int a, int b, int c)
	{
		System.out.println("Parent 3 parameterized constructor.");
	}
}
