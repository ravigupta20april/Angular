package Assignment2;

public class EmailFilters {
	
	String emails[] = {
			
			"ramesh@gmail.com",
			"rakesh@outlook.com",
			"lokesh@linkedin.com",
			"mahesh@gmail.com",
			"ganesh@gmail.com",
			"rajesh@outlook.com"
	};
	
	public static void main(String[] args) {
		/*
		 * Write the code to count the number of users in particular 			domain
		 * for example 
		 * gmail has 3 users
		 * outlook has 2 users
		 * linkedin has 1 user
		 *  
		 * HINT : use endsWith() of String class
		 * */
		EmailFilters ef = new EmailFilters();
		String[] email = ef.emails;

		int gmailCount = 0, outlookCount = 0, linkedInCount = 0;

		for(int i = 0; i< email.length; i++) {
		String ipPart = email[i].split("@")[1];
		if(ipPart.equals("gmail.com")) {
		gmailCount++;
		}
		else if(ipPart.equals("outlook.com")) {
		outlookCount++;
		}
		else {
		linkedInCount++;
		}
		}
		System.out.println("Gmail Users= "+gmailCount+" Outlook Users="+outlookCount+" LinkedIn Users="+linkedInCount);
		 
		}

}


 	
	
