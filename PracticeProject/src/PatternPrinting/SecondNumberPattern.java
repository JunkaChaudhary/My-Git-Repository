package PatternPrinting;

public class SecondNumberPattern 
{
	public void NumberPattern2()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		SecondNumberPattern obj= new SecondNumberPattern();
		obj.NumberPattern2();
	}

}
