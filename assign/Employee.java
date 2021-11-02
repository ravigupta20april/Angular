package assign;

public class Employee implements Addressable{
	String city , state;
	
	
	public Employee(String city , String state) {
		this.city = city;
		this.state = state;
	}
	
	@Override
	public String getCity(){
		return city;		
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return state;
	}
}