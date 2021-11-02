package streamassignment;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainRunner {
	static List<Account> list = new ArrayList<>();

	/*
	 * Requirement (to be done by stream API only through both approach anonymous
	 * inner class & lambda expression) 1. Update email on the basis of
	 * accountNumber 2. display Account based on maximum sumAssuredAmount 3. update
	 * premium amount of all medical policies by 10% 4. filter accounts based on
	 * following (display there accountnumber , name and phoneNumber through
	 * separate bean class) 4.a ) state and policyname 4.b) state and premiumAmount
	 * (higher than certain amount) and total balance
	 * 
	 */
	public static void main(String[] args) {
		addAccount();
		addAccount();
		updateEmail(1001);
		updatePremiumAmount();
		filterStatePolicyName("UP", "Jhansi");
		filterStatePremiumAmountBalance("UP", 100);

	}

	public static void addAccount() {
		ContactDetails contactDetails = new ContactDetails("65C", "UP", 7398573674L, "ravi@gmail.com");
		List<Policy> list1 = new ArrayList<>();
		Policy policy = new Policy(101, "Ravi", 10000, 20000);
		list1.add(policy);
		Account account = new Account();
		account.setAccountHolderName("Ravi");
		account.setAccountNumber(1001);
		account.setBalance(1000);
		account.setContactDetails(contactDetails);
		account.setPolicies(list1);
		list.add(account);

	}

	public static void updateEmail(int accountNumber) {
		List<Account> list1 = list.stream().filter(account -> (account.getAccountNumber() == accountNumber))
				.map(account -> {
					account.getContactDetails().setEmail("ravigupta@gmail.com");
					return account;
				}).collect(Collectors.toList());
		System.out.println(list);

	}

	public static void maxSumAssuredAmount(int balance) {
			Comparator<Policy>  policyMax = (pol1,pol2)->pol1.getSumAssuredAmount()-pol2.getSumAssuredAmount();
			
	}

	public static void updatePremiumAmount() {
		list.stream().map(account -> {
			List<Policy> list1 = account.getPolicies();
			for (Policy policy : list1) {
				policy.setPremiumAmount((int) (policy.getPremiumAmount() * 1.1));
			}
			return account;
		}).collect(Collectors.toList());
		System.out.println(list);
	}

	public static void filterStatePolicyName(String state, String policyName) {
		List list1 = list.stream().map(account -> {
			if (account.getContactDetails().getState().equalsIgnoreCase(state)
					&& account.getPolicies().get(0).getPolicyName().equalsIgnoreCase(policyName)) {
				return account.getAccountNumber() + " " + account.getAccountHolderName() + " "
						+ account.getContactDetails().getPhoneNumber();
			}
			return "no state and policy matched!!";

		}).collect(Collectors.toList());
		System.out.println(list1);

	}

	public static void filterStatePremiumAmountBalance(String state, int premiumAmount) {
		List list1 = list.stream().map(account -> {
			if (account.getContactDetails().getState().equalsIgnoreCase(state)
					&& account.getPolicies().get(0).getPremiumAmount() == premiumAmount) {
				return account.getAccountNumber() + " " + account.getAccountHolderName() + " "
						+ account.getContactDetails().getPhoneNumber();

			}
			return "no state and policy matched!!";
		}).collect(Collectors.toList());
		System.out.println(list1);
	}

}
