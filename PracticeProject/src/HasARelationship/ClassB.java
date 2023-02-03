package HasARelationship;

public class ClassB {
	
	public void m2()
	{
		System.out.println("This is ClassB method");
	}

	public static void main(String[] args) {
		
		ClassA obj1= new ClassA();
		obj1.m1();
		
		ClassB obj2= new ClassB();
		obj2.m2();
	}
}

