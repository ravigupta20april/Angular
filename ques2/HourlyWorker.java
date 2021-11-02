package ques2;

public class HourlyWorker extends Worker {

	public HourlyWorker(String name, int rate) {
		super(name, rate);
	}
		@Override
		public int computePay(int hours) {
		if (hours<=40){
			return hours*this.getRate();
		}
		else {
			return (int) (40*this.getRate()+(40-hours)*this.getRate()*1.5);
		}
	}

	
}