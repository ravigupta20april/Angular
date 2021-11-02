package Assignment2;

import java.util.Scanner;
public class CountCharacters {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the string:");
	   String name=sc.nextLine();
	   
	   int size=26;
	   int n=name.length();
	   int freq[]=new int [size];
	   for(int i=0;i<n;i++) {
		   freq[name.charAt(i)-'a']++;
	   }
	   
	   for(int i=0;i<n;i++) {
		   if(freq[name.charAt(i)-'a']!=0) {
			   System.out.println(name.charAt(i)+" "+freq[name.charAt(i)-'a']+" ");
			   freq[name.charAt(i)-'a']=0;
			  
		   }
	   }
	   
   }
}
