package LoopPracticeTasks;

public class SwapNumberUsingThirdVariable 
{

	public static void main(String[] args) 
	{
		int a = 20;
		int b = 30;
		int temp;
 
		System.out.println("Value of a before swap: " + a);
		System.out.println("Value of b before swap: " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Value of a after swap: " + a);
		System.out.println("Value of b after swap: " + b);
		
	}
}
