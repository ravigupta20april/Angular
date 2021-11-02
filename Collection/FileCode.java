package Collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCode {

	static String location = "C:\\Users\\ravig\\Desktop";
	
	public static void search(String input)
	{
		File f = new File(location +"\\ravi.txt");
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			int count = 0;
			String line = "";
			
			while((line = br.readLine())!= null)
			{
				count++;
				
					if(line.equalsIgnoreCase(input))
					{
						System.out.println("The word "+ input+ " is present at "+ count);

					}
					
			}
	
			br.close();
			} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
}