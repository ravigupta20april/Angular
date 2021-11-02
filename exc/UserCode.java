package exc;

public class UserCode {
	public static void main(String[] args)
	{
		CustomExc c = new CustomExc();
		try {
			c.CountryException("India");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
