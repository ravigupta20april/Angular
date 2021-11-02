package exc;

public class CustomExc {
	public void CountryException(String country) throws InvalidCountry{
		if(country.equals("India") || country.equals("Nepal") || country.equals("Bhutan") || country.equals("Srilanka"))
		{
			System.out.println("Country is Valid");
		}
		else {
			InvalidCountry e = new InvalidCountry(country);
			throw e;
		}
		
	}

}
