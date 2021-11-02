package exception;
import java.util.*;

public class UserCode {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		String s = sc.next();
		
		try {
			int n = Integer.parseInt(s);
			System.out.print("It is Integer");
		}
		catch(Exception e) {
			System.out.print(e);
			System.out.print("Not Integer");
		}
	}

}
