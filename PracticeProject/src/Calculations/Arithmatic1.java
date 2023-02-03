package Calculations;

public class Arithmatic1 {

	public int sum(int a, int b)
	{
		int sum = a+b;
		System.out.println("SumResult is: " + sum);
		return sum;
	}	
	public int sub(int a2, int b2)
	{
		int sub = a2-b2;
		System.out.println("Subresult is: " + sub);
		return sub;
	}	
	public int mul(int a3, int b3)
	{
		int mul = a3*b3;
		System.out.println("MulResult is: " + mul);
		return mul;
	}
	public float div(int a4, int b4)
	{
		int div = a4/b4;
		System.out.println("DivResult is: " + div);
		return div;
	}	
	public static void main(String[] args) {
		Arithmatic1 obj = new Arithmatic1();
		int sumresult1 = obj.sum(10, 2);
		int sumresult2 = obj.sum(sumresult1, 2);
		int subresult = obj.sub(sumresult2, 2);
		int mulresult = obj.mul(subresult, 2);
		float divresult = obj.div(mulresult, 2);
		System.out.println("Final Result is: " + divresult);
	}
}

