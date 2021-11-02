package p2;
import java.util.*;
public class Addition
{
public static void Add(int a , int b)
{
	int C=a+b;
	System.out.println("Addition"+C);
	
}

public static void main(String args[])
{
	System.out.println("Enter two numbers:-");
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	Addition.Add(a, b);
	
}

}

	
