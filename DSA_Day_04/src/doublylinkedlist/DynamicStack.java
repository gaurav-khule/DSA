package doublylinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class DynamicStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int choice,e;
		 
		 LinkedList<Integer> sl = new LinkedList<Integer>();
		 
		 do {
			   System.out.print("\n\n===== Satck Menu =====");
	           System.out.print("\n1. Push");
	           System.out.print("\n2. Pop");
	           System.out.print("\n3. Print");
	           System.out.print("\n4. Peek");
	           System.out.print("\n0. Exit");
			 
			 System.out.print("\nEnter your choice: ");
			 choice = sc.nextInt();
			 
			 switch(choice) {
			 case 1:
					 System.out.print("Enter element: ");
					 e = sc.nextInt();
					 sl.addFirst(e); 
				 break;
			 case 2:
				 if(!sl.isEmpty())
				 System.out.println("Popped: " + sl.removeFirst());
				 else
					 System.out.println("Stack is empty");
				 break;
			 case 3:
				 if(!sl.isEmpty())
					 System.out.print("List: " + sl);
				 else
					 System.out.println("Stack is empty");
				 break;
			 case 4:
				 if(!sl.isEmpty())
					 System.out.println("Peek: " + sl.getFirst());
				 else
					 System.out.println("Stack is empty");
				 break;
			 case 0:
				 System.out.println("Thank You");
				 break;
			default :
				System.out.println("INVALID CHOICE");
				break;
			 }
		 }while(choice != 0);
	  }
}	 	