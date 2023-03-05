package PatternPrinting;

public class HalfPyramid 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=4; i++)  //outer loop --for rows
		{
			for(int j=1; j<=i; j++)  //inner loop--for columns
			{
				System.out.print("*");
			}
			System.out.println();
		}				
	}
}
