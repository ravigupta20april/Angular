package arrays;

public class ArraysWork {

	int arr[] = {15,19,6,3,74,84,62,100,20,38,415,3,74,16,15,9,650,67};
	
	
	public int[] getRepeatedValues()
	{
		int x=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					x++;
				}
		    }
    	}
		int repeated[]= new int[x];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
				f
				}
			}
		}
		
	}
	
	public short getSum()
	{
		short sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=(short)(sum+arr[i]);
		}
		return sum;
	}
	
	public static _______ getUniqueValues()
	{
		
	}
	
}

public class ArrayMainClass {

	public static void main(String[] args) {
		 
	}
}
