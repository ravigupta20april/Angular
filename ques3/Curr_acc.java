package ques3;

public class Curr_acc extends Account {	
	
	int serviceCharge=100;
	int chequeBook;
	int minimumBalance=10000;
	
	public Curr_acc() {
	}
	
	public void issueCheque() {
		System.out.println("Cheque book will be issued, because you use a current account");
	}
	
	
	public void penalty() {
		if (getBalance()<minimumBalance) {
			System.out.println("Balance is less than minimum balance, So Penalty will be imposed");
			setBalance((getBalance()-serviceCharge));
			display();
		}
		else {
			System.out.println("No penalty!");
			display();
		}
	}
	
	public void interestFacility() {
		System.out.println("This account does not have any interest facility");
	}
	
}