package PatternPrinting;

public class FirstNumberPattern 
{
		public void NumberPattern1()
		{
			for(int i=1; i<=5; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(j+"");
				}
				System.out.println();
			}
		}
		
		public static void main(String[] args) 
		{
			FirstNumberPattern obj= new FirstNumberPattern();
			obj.NumberPattern1();
		}

}
