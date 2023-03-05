package PatternPrinting;

public class CompleteStarPyramid 
{
	public static void main(String[] args) 
	{
		int n=5;  //number of rows
		
		for(int i=1; i<=n; i++)
		{
			//space print
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			
			//star print
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}	

}
