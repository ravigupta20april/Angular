package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCode {

	static String location = "C:\\Users\\anjal\\OneDrive\\Desktop";
	
	public static void search(String inputWord)
	{
//		String words[] = null;
		File f = new File(location +"\\Demo.txt");
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			int countLine = 0;
//			int count = 0;
			String line = "";
			
			while((line = br.readLine())!= null)
			{
				countLine++;
				
					if(line.equalsIgnoreCase(inputWord))
					{
						System.out.println("The word "+ inputWord+ " is present at "+ countLine);

					}
					
			}
	
			br.close();
			} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
}