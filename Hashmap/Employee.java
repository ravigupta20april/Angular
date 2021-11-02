package Hashmap;
import java.util.HashMap;

public class Employee{
	
	public static void main(String[] args) {


HashMap<Integer, String> map = new HashMap<Integer, String>();
map.put(101,"Ramesh");
map.put(101,"Ramesh");
map.put(101,"Ramesh");

Iterator<Integer> itr = map.keySet().iterator();
// extract key set from map key

while(itr.hasNext())
{
	int key = itr.next();
	Employee value = map.get(key);
	
	// ... rest of the code
}	
}
}

