package UseOfStaticKeyword;

//Result of a will be stored at Class level after every object call//
//Here Static keyword is used with variable & method both//

public class StaticKeywordWithMethod 
{
	static int a;
	
	public static void m1()
	{
		//a = a+1;
		System.out.println("Method 1 Statement.");
	}
	
//	public void m2()
	{
		m1();   // direct call
		StaticKeywordWithMethod.m1();  //call using classname
		StaticKeywordWithMethod obj = new StaticKeywordWithMethod();
		obj.m1();    // call via reference variable				
	}
//	
	
	public static void main(String[] args) 
	{
		StaticKeywordWithMethod.m1();
		StaticKeywordWithMethod.a = 150;
		System.out.println("Object 1 value: " + a);
	}

}
