package Collection;

import java.util.Scanner;

public class SearchWord {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word");
		
		String word = sc.nextLine();
		
		FileCode.search(word);
		
		sc.close();
	}

}
