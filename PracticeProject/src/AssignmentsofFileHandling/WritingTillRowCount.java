package AssignmentsofFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingTillRowCount 
{
	public void WriteDataTillAPosition(int rowCount) throws IOException
	{
		File f= new File("../PracticeProject/TextFileData.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter b= new BufferedWriter(fw);
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter Data:");
		String d;
		for(int i=1; i<=rowCount; i++)
		{
			d= s.next();
			b.write(d);
			b.newLine();
		}	
		//b.write();
		b.close();
	}
	public static void main(String[] args) throws IOException 
	{
		WritingTillRowCount obj= new WritingTillRowCount();
		obj.WriteDataTillAPosition(5);		
	}

}
