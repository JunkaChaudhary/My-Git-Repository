package UseOfStaticKeyword;

//Result of a will be stored at Class level after every object call//
//Here Static keyword is used with variable only//

public class WithStaticKeyword 
{
	static int a=20;

	public void m1()
	{
		a = a+1;
	}
	
	public static void main(String[] args) 
	{
		// first object creation//
		WithStaticKeyword obj1 = new WithStaticKeyword();
		obj1.m1();
		System.out.println("Object 1 value: " + obj1.a);
		
		//second object creation//
		WithStaticKeyword obj2 = new WithStaticKeyword();
		obj2.m1();
		System.out.println("Object 2 value: " + obj2.a);
		
		//third object creation//
		WithStaticKeyword obj3 = new WithStaticKeyword();
		obj3.m1();
		System.out.println("Object 3 value: " + obj3.a);
	}

}
