package AssignmentsofFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataOfRange 
{
	public void ReadDataOfaRange(int start, int end) throws IOException
	{
		File f= new File("../PracticeProject/TextFileData.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String s;
		int temp=0;
		while((s=br.readLine())!=null)
		{
			temp=temp+1;
			if((temp>=start)&&(temp<=end))
			{
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) throws IOException 
	{
		ReadingDataOfRange obj= new ReadingDataOfRange();
		obj.ReadDataOfaRange(2, 5);
		
	}

}
