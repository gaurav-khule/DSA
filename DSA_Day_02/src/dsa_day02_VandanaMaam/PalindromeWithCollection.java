package dsa_day02_VandanaMaam;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeWithCollection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter a String: ");
		String str = sc.nextLine();
		
		Stack<Character> stack = new Stack<Character>();
		
		boolean palindrome = true; 
		
		for(int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != stack.pop()) {
				palindrome = false;
				break;
			}	
		}
		if(palindrome == true) {
			System.out.println("\nString is palindrome");
		}else {
			System.out.println("\nString is NOT a palindrome");
		}
	}
}
