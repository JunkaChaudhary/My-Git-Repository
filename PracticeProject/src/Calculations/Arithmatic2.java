package Calculations;

public class Arithmatic2 {
	public int div(int a, int b)
	{
		int div = a/b;
		System.out.println("DivResult is: " + div);
		return div;
	}	
	public int sub(int a, int b)
	{
		int sub = a-b;
		System.out.println("Subresult is: " + sub);
		return sub;
	}	
	public int sum(int a, int b)
	{
		int sum = a+b;
		System.out.println("Sumresult is: " + sum);
		return sum;
	}	
	public int mul(int a, int b)
	{
		int mul = a*b;
		System.out.println("MulResult is: " + mul);
		return mul;
	}
	
	public static void main(String[] args) {
		Arithmatic2 obj = new Arithmatic2();
		int divresult = obj.div(10, 2);
		int subresult1 = obj.sub(divresult, 2);
		int sumresult = obj.sum(subresult1, 2);
		int subresult2 = obj.sub(sumresult, 2);
		int mulresult = obj.mul(subresult2, 2);
		System.out.println("Final Result is: " + mulresult);
	}
}
