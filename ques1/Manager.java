package ques1;

public class Manager implements Role{

	@Override
	public String getRoleName() {
		String p="Manager=";
		return p;
	}

	@Override
	public String getResponsibility() {
		String r="Manages the Company!";
		return r;
	}
	
	

}