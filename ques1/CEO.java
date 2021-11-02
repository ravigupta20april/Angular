package ques1;
public class CEO implements Role {

	@Override
	public String getRoleName() {
		String p="CEO: ";
		return p;
	}
	@Override
	public String getResponsibility() {
		String r="Runs the Company!";
		return r;
	}
}

