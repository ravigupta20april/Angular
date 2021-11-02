package ques5;

public class LabCourse extends CollegeCourse{
	
	private final int labFee=50;
	private int labCourseFee;
	
	public LabCourse(String department, int CourseNo, int credits) {
		super(department, CourseNo, credits);
		labCourseFee=super.getCourseFee()+labFee;
	}
	
	public int getlabCourseFee() {
		return labCourseFee;
	}
	
	public void display() {
		System.out.println("Department is= "+ super.getDepartment());
		System.out.println("Course Number is= "+super.getCourseNo());
		System.out.println("Course Fee is= "+getlabCourseFee());
	}

}
