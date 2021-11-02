package arrays;

public class TrueCallerApp {
	
	public static void main(String[] args) {
		MobilePhoneDatabase db=new MobilePhoneDatabase();
		
		long arr[]=db.getAllPhoneNumbers();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println((i+1)+")"+arr[i]);
		}
	}

}
