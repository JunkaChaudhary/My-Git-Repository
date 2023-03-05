package TextFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteMultipleLine 
{
	public static void main(String[] args) throws IOException 
	{
		File f= new File("../PracticeProject/TextFileData.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter br= new BufferedWriter(fw);
		
		br.write("First line written successfully.");
		br.newLine();
		br.write("Second line written successfully.");
		br.close();		
	}

}
