package TextFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendNewDataToExistingData 
{
	public static void main(String[] args) throws IOException 
	{
		File f= new File("../PracticeProject/TextFileData.txt");
		FileWriter fw= new FileWriter(f, true);
		BufferedWriter br= new BufferedWriter(fw);
		br.newLine();
		br.write("Sixth line of Data.");
		br.newLine();
		br.write("Seventh line of Data.");
		br.newLine();
		br.write("Eighth line of Data.");
		br.close();
	}
}
