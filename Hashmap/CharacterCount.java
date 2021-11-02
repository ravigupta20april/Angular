package Hashmap;
import java.io.*;
import java.util.*;

public class CharacterCount {
	static void CharacterCount(String input){
		
		HashMap <Character , Integer> charcount = new HashMap<Character , Integer>();
		
		char[] strArray = input.toCharArray();
		
		for(char c : strArray)
		{
			if(charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c)+1);
			}
			else {
				charcount.put(c,1);
			}
		}
		for(Map.Entry entry : charcount.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	public static void main(String[] args)
	{
		String str = "njsfndgfndjg";
		CharacterCount(str);
	}

}
