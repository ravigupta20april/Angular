package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		doMin();
	}
	
	public static void doMin(){
		
		Employee e1 = new Employee(1 , "A" , 10000);
		Employee e2 = new Employee(1 , "B" , 15000);
		Employee e3 = new Employee(1 , "C" , 30000);
		
		Comparator<Employee> empsalary = (emp1 , emp2)->{
			return emp1.getSalary()- emp2.getSalary();
		};
		Employee e = Stream.of(e1,e2,e3).min(empsalary).get();
		System.out.println(e.getSalary());
		
	
	
		List<Employee> list = new ArrayList<>();
		list = Stream.of(e1,e2,e3).filter((emp)->(emp.getSalary())>10000 && (emp.getSalary())<20000).collect(Collectors.toList());
		System.out.println(list);
		
	}
	public static void doMapTask() {
		Employee e1 = new Employee(1 , "A" , 10000);
		Employee e2 = new Employee(1 , "B" , 15000);
		Employee e3 = new Employee(1 , "C" , 30000);
		
	}
}

	
