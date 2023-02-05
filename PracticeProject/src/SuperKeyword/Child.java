package SuperKeyword;

public class Child extends Parent
{
	public Child()
	{
		this(10,11);
		System.out.println("Child default constructor.");
	}
	
	public Child(int a)
	{
		this(12,15,16);
		System.out.println("Child 1 parameterized constructor.");
	}
	
	public Child(int a, int b)
	{
		super(5,6);
		System.out.println("Child 2 parameterized constructor.");
	}

	public Child(int a, int b, int c)
	{
		this();
		System.out.println("Child 3 parameterized constructor.");
	}
	
	public static void main(String[] args) 
	{
		Child obj = new Child(123);
	}

}
