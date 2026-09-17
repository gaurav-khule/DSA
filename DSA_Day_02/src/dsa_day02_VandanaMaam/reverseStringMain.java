package dsa_day02_VandanaMaam;

import java.util.Scanner;

public class reverseStringMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter string: ");
		String inputStr = sc.nextLine();
		reverseString rs = new reverseString();
		String reverse = rs.revString(inputStr);
		
		System.out.println("\nReverse String: " + reverse);
	}
}
