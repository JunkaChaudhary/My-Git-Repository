package AssignmentsofFileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyAndPasteDataInAnotherFile 
{
	public void CopyAndPaste() throws IOException
	{
		File f1= new File("../PracticeProject/TextFileData.txt");
		FileReader fr= new FileReader(f1);
		BufferedReader br= new BufferedReader(fr);
		
		File f2= new File("../PracticeProject/TextFile2.txt");
		FileWriter fw= new FileWriter(f2);
		BufferedWriter bw= new BufferedWriter(fw);
		
		String copiedData;
		while((copiedData=br.readLine())!=null)
		{
		   bw.write(copiedData);
		   bw.newLine();
		}
		br.close();
		bw.close();

		System.out.println("Data copied & pasted successfully..");		
	}
	
	public static void main(String[] args) throws IOException
	{
		CopyAndPasteDataInAnotherFile obj= new CopyAndPasteDataInAnotherFile();
		obj.CopyAndPaste();
	}
}
