package ques1;

public class user {
	
	public static void main(String[] args) {
		
		CEO c=new CEO();
		Manager m=new Manager();
		System.out.println(c.getRoleName()+c.getResponsibility());
		System.out.println(m.getRoleName()+m.getResponsibility());
	}

}