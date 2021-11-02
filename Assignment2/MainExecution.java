package Assignment2;

public class MainExecution {
	
public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();
		String codes[] = service.getEmployeeCodes();
		String city[]=service.getEmployeeCity();
		System.out.println(city);
		for(int i=0;i<codes.length;i++) {
			System.out.println(codes[i]+":"+service.getCityByCode(city[i]));
		}
		
		
	}
}