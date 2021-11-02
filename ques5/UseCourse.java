package ques5;
import java.util.Scanner;

public class UseCourse {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter department=");
		String department=sc.nextLine();
		
		System.out.println("Enter course number=");
		int CourseNo=sc.nextInt();
		
		System.out.println("Enter credit hours=");
		int hours=sc.nextInt();
		
		if(department=="BIO" || department=="CHM" || department=="CIS" || department=="PHY") {
			LabCourse lb=new LabCourse(department, CourseNo, hours);
			lb.display();
		}
		else {
			CollegeCourse cc=new CollegeCourse(department, CourseNo, hours);
			cc.display();
		}
	}

}
