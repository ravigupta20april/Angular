package exc;

public class InvalidCountry extends Exception {
	String wrongCountry;
	public InvalidCountry(String wrongCountry) {
		super();
		this.wrongCountry = wrongCountry;
	}
	public String toString()
	{
		return "InvalidCountry Country is wrong";
	}

}
