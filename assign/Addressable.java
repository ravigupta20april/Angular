package assign;

public interface Addressable {

	
	public String getState();
	public String getCity();
	default String getFullAddress(){
		return getCity()+" "+getState();
		
	}
}
