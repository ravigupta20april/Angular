package ques2;
import java.util.Scanner;

public class User {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name=");
		String name=sc.next();
		System.out.println("Enter the total number of hours=");
		int hours=sc.nextInt();
		System.out.println("Enter rate per hour=");
		int rate =sc.nextInt();
		System.out.println("Input 1 for Hourly Worker and  Input 2 for Salaried Worker=");
		int ip=sc.nextInt();
		System.out.println("The name and the salary per week is=");
		if (ip==1) {
		HourlyWorker hw=new HourlyWorker(name, hours);
		System.out.println(name+" :"+hw.computePay(hours));
		}
		
		else {
		SalariedWorker sw=new SalariedWorker(name,  hours);
		System.out.println(name+" :"+sw.computePay(hours));
		
		
	}

}
}
