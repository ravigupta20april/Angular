package Assignments;
import java.util.*;

public class Table {
	
	public void PrintTable(int num , int start , int end )
	{
		int arr[]=new int[10];
		
		if((start-end)>10)
		{
			System.out.println("error");
			
		}
		else
		{
			for(int i=start ; i<=end ; i++)
			{
				if(i<=end)
				{
					arr[i]=num*i;
			
				}
				else {
					arr[i]=-1;
				}
				System.out.println(arr[i]);
			}
			
		}
		
	}
	public static void main (String[] args)
	{
		Table tb = new Table();
		System.out.println("Enter the Number which Table you want to print:-");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter the Starting range 1:-");
		int start=sc.nextInt();
		System.out.println("Enter the End range 2:-");
		int end = sc.nextInt();
		tb.PrintTable(num , start , end);
		
		
		
	}

}
