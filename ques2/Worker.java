package ques2;

public class Worker {

	private String name;
	private int rate;
	
	public Worker( String name, int rate){
	       this.name = name;
	        this.rate = rate;
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	public int computePay(int hours) {
		int salary=hours*rate;
		return salary;
	}
}
