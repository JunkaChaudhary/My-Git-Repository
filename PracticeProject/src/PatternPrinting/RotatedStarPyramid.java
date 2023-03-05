package PatternPrinting;

public class RotatedStarPyramid 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			//inner loop1 -- space print
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			//inner loop2--star print
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}	

}
