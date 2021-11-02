package ques2;

public class SalariedWorker extends Worker {

	public SalariedWorker(String name, int rate) {
		super(name, rate);
	}
		@Override
		public int computePay(int hours) {
			return hours*this.getRate();
	}
		
}
