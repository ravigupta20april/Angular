package ques5;

public class CollegeCourse {

	private final int CreditFee=120;
	private String department;
	private int CourseNo;
	private int CourseFee;
	private int credits;
	
	public CollegeCourse(String department, int CourseNo, int credits) {
		this.department=department;
		this.CourseNo=CourseNo;
		this.credits=credits;
		CourseFee=CreditFee*credits;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getCourseNo() {
		return CourseNo;
	}

	public void setCourseNo(int courseNo) {
		CourseNo = courseNo;
	}

	public int getCourseFee() {
		return CourseFee;
	}

	public void setCourseFee(int courseFee) {
		CourseFee = courseFee;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getCreditFee() {
		return CreditFee;
	}
	
	public void display() {
		System.out.println("Department is ="+ this.getDepartment());
		System.out.println("Course Number is ="+this.getCourseNo());
		System.out.println("Credit hours is "+this.getCredits());
		System.out.println("Course Fee is "+this.getCourseFee());
	}
}
