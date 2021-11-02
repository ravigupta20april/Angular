package WiFiVideoCalling;

public class Mobile{
	WiFi wifi=new WiFi() {
		@Override
	    public  void VideoCalling(String Caller,String reciever) {
		   	System.out.println("Doing VideoCalling");
	 
		
		if(Caller!=null && reciever!=null) {
			wifi.VideoCalling(Caller,reciever);
		}
		
		}
	  
		};
		
	public static void main(String args[]) {
		  
		   
		
		}
}
