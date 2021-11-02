package Assignment2;

public class EmployeeService {

	private String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080"};
	public String[] getEmployeeCodes()
	{
		String codes[] = new String[employees.length];
		int count = -1;
		for (String empid : employees) {
			codes[++count] = empid.substring(0, 3);
		}
		
		return codes;
	}
	
	public String[] getEmployeeCity() {
		String city[]=new String[employees.length];
		int count=-1;
		for(String empid:employees) {
			city[++count]=empid.substring(6,9);
		}
		return city;
	}
	
	public String getCityByCode(String code) {
		switch(code) {
		case "011":
			return "Delhi";
			
		case "022":
			return "Mumbai";
		
		case "080":
			return "Banglore";
		case "020":
			return "Pune";
			
		default:
			return "Not matching";
		}	
		
	}
	
	
}//end employee service class


	
	
