package dsa_day02_VandanaMaam;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice, e;
		
		System.out.print("\nEnter stack size: ");
		int size = sc.nextInt();
		
		StackExample obj = new StackExample();
		
		obj.createStack(size);
		
		do {
			
			System.out.println("\n");
			System.out.print("\nStack Menu");
			System.out.print("\n-----------------");
			System.out.print("\n1.Push");
			System.out.print("\n2.Pop");
			System.out.print("\n3.Peek");
			System.out.print("\n4.Print");
			System.out.print("\n0.Exit");
			System.out.print("\n");
			
			System.out.print("\nEnter Choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(!obj.checkIsFull()) {
					System.out.print("\nEnter Element: ");
					e = sc.nextInt();
					obj.Push(e);
				}else {
					System.out.print("\nStack is Full");
				}
				break;
			case 2:
				if(!obj.isEmpty()) {
					System.out.print("\nPopped element: " + obj.pop());
				}
//				else {
//					System.out.print("Stack is Empty");
//				}
				break;
			case 3:
				if(!obj.isEmpty()) {
					System.out.print("Peek: " + obj.peek());
				}else {
					System.out.print("\nStack is Empty");
				}
				break;
			case 4:
				if(!obj.isEmpty()) {
					obj.printStack();
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
