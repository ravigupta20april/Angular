package p1;



public class BusniessOperations {



	public void calculateTax(int basicSalary)

	{

		float hra=getHRA(basicSalary);

		float da=getDA(basicSalary);

		float tax=getTax(basicSalary+hra+da);

		float grossSalary=hra+da+basicSalary;

		System.out.println("Basic Salary "+basicSalary);

		 System.out.println("HRA :- "+hra);

		 System.out.println("DA:- "+da);

		 System.out.println("Gross Salary "+grossSalary);

		 System.out.println("Tax Amount "+tax);

		 System.out.println("Net Salary: ");

	}

	public float getHRA(int basicSalary){

		float hra=0;

		return hra;

		

	}

	public float getDA(float basicSalary)

	{

		return 0;

	}

	public float getTax(float netSalary)

	{

	 float tax=0;

		if(netSalary>=500000 && netSalary<=1000000)

		{

			tax=(float)0.20*netSalary;

		}

		else if(netSalary>1000000)

		{

			tax=(float)0.30*netSalary;

		}

		return tax;

	}

}