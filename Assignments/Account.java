package Assignments;

public class Account {

	private KYCVerification kycdetails;
	private ContactDetails contactDetails;
	
	private long accountNumber;
	private String username;
	private String password;
	private int balance;
	private int cashback;
	public KYCVerification getKycdetails() {
		return kycdetails;
	}
	public void setKycdetails(KYCVerification kycdetails) {
		this.kycdetails = kycdetails;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCashback() {
		return cashback;
	}
	public void setCashback(int cashback) {
		this.cashback = cashback;
	}
	
	public int deposit(int amount)
	{
		balance = balance + amount;
		return balance;
	}
	
	public int withdrawal(int amount)
	{
		if(amount<=(balance-5000))
		{
			int bal = balance-amount;
			balance = (int)(bal + (amount*0.01));
			cashback = (int)(amount*0.01);
			return balance;
		}
		return -1;
	}
	
	@Override
	public String toString() {
		return "Account is [accountNumber=" + accountNumber + ", username=" + username + ", password=" + password
				+ ", balance=" + balance + ", cashback=" + cashback + "]";
	}
}
