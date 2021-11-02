package arrays;
import java.util.Random;
public class TwoDArrays {
	
	public static void main(String[] args)
	{
		Random random = new Random();
		int arr[][] = new int [3][2];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]= random.nextInt(100);
			}
		}
	}

}
