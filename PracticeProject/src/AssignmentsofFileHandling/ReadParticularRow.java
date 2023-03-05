package AssignmentsofFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadParticularRow 
{
	public void ReadFromParticularRow(int row) throws IOException
	{
		File f= new File("../PracticeProject/TextFileData.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String s;
		int temp=0;
		while((s=br.readLine())!=null)
		{
			temp=temp+1;
			if(temp==row)
			{
				System.out.println(s);
				break;
			}
		}
	}
	public static void main(String[] args) throws IOException 
	{
		ReadParticularRow obj= new ReadParticularRow();
		obj.ReadFromParticularRow(4);
		
	}
}
