package day3;

public class Device {

	private String deviceName;
	private String modelNumber; // as Id , should be auto-generated combination of char or numbers (6 chars) 
	// such as abc123 , xyz343, bjb543 
	private int cost;
	private int avgRating;
  private String brandName;
	
	public Device(String deviceName, int cost, int avgRating,String brandName) {
		this.deviceName = deviceName;
		this.cost = cost;
		this.avgRating = avgRating;
		this.brandName = brandName;
	} 
	
	
}//end class
