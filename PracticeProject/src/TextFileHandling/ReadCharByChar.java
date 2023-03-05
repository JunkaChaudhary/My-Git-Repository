package TextFileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharByChar 
{
	public static void main(String[] args) throws IOException 
	{
		File f= new File("../PracticeProject/TextFileData.txt");
		FileReader fr= new FileReader(f);
		int a;
		
		while((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}		
	}

}
