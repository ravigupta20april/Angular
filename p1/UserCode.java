package p1;
import java.util.*;
public class UserCode{
	
	
	public static void main(String[] args) {
		
		userFormToEnterSalary();
		
	}
	public static void userFormToEnterSalary()
	{
		java.util.Scanner sc =new Scanner(System.in);
		BusniessOperations server = new BusniessOperations();
		System.out.println("Enter Basic Salary:-");
		int basicSalary = sc.nextInt();
		server.calculateTax(basicSalary);
	}
	public static void printSalaryBreakup()
	{
		System.out.println("");
	}
}
