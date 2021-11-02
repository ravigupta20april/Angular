package arrays;

public class MobilePhoneDatabase {
  long phoneNumbers[]= {
		  9599559955L,
		  1212121212L,
		  1212121334L,
		  1234567890L,
		  3456783456L
  };
  
  public long[] getAllPhoneNumbers()
  {
	  return phoneNumbers;
  }
  
  public boolean verifyPhoneNumbers(long searchphoneNumber)
  {
	  boolean isAvailable=false;
	  
	  for(int i=0;i<phoneNumbers.length;i++)
	  {
		  if(phoneNumbers[i]  ==   searchphoneNumber)
		  {
			  isAvailable=true;
			  break;
		  }
	  }
	  return isAvailable;
  } 
	  public boolean updatePhoneNumber(long newPhoneNumber , long oldPhoneNumber)
	  {
		  boolean isUpdated=false;
		  for(int i=0;i<phoneNumbers.length;i++)
		  {
			  if(phoneNumbers[i]==oldPhoneNumber)
			  {
				  phoneNumbers[i]=newPhoneNumber;
				  
			  }
			  isUpdated=true;
			  break;
		  }
		  return isUpdated;
	  
  }
}
