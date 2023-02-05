package UseOfStaticKeyword;

//Result of a will be stored at object level for non-static variables//

public class WithoutStaticKeyword 
{
	int a=20;
	public void m1()
	{
		a= a+1;
	}
	
	public static void main(String[] args) 
	{
		//********first object***********
		WithoutStaticKeyword obj1 = new WithoutStaticKeyword();
		obj1.m1();
		System.out.println("Object 1 value: " + obj1.a);
		
		//********second object***********
		WithoutStaticKeyword obj2 = new WithoutStaticKeyword();
		obj2.m1();
		System.out.println("Object 2 value: " + obj2.a);
		
		//********first object***********
		WithoutStaticKeyword obj3 = new WithoutStaticKeyword();
		obj3.m1();	
		System.out.println("Object 3 value: " + obj3.a);
		
	}

}
