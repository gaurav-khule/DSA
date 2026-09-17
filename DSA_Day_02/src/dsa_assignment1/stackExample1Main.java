package dsa_assignment1;

import java.util.Scanner;

public class stackExample1Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		
		int choice, e;
		
		StackExample1 stc = new StackExample1();
		
		stc.createStack(size);
		
		
		do {
			
			System.out.print("\nStack Menu");
			System.out.print("\n-----------------");
			System.out.print("\n1.Push");
			System.out.print("\n2.Pop");
			System.out.print("\n3.Print");
			System.out.print("\n0.Exit");
			System.out.print("\n");
			
			System.out.print("\nEnter Choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(!stc.isFull()) {
					System.out.print("\nEnter Element: ");
					e = sc.nextInt();
					stc.push(e);
				}else {
					System.out.print("\nStack is Full");
				}
				break;
			case 2:
				if(!stc.isEmpty()) {
					System.out.print("\nPopped element: " + stc.pop());
				}else {
					System.out.print("Stack is Empty");
				}
				break;
			
			case 3:
				if(!stc.isEmpty()) {
					stc.print();
				}else {
					System.out.print("\nStack is Empty");
				}
				break;
			case 0:
				System.out.print("\nThank You!!");
				break;
			default :
				System.out.print("\nINVALID CHOICE");
				break;
			}
		}while(choice != 0);
	}
}

