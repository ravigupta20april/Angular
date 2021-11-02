package lambda;

public interface SecurityCheck {
	public String validateUser(String username , String password , int pin);

}
