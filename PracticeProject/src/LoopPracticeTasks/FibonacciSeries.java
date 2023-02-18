package LoopPracticeTasks;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int a=0, b=1,c;
		
		System.out.println("Fibonacci Series is:");
		for(int i=1; i<=12; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
