package doublylinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueLinkedList {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     // Create Queue using LinkedList
	     LinkedList<Integer> obj = new LinkedList<Integer>();

	     int choice = 0, e;

	     do {

	         System.out.print("\n\nQueue Menu");
	         System.out.print("\n-----------");
	         System.out.print("\n1. Enqueue");
	         System.out.print("\n2. Dequeue");
	         System.out.print("\n3. Print Queue");
	         System.out.print("\n4. At_Front");
	         System.out.print("\n5. At_Last");	         
	         System.out.print("\n0. Exit");
	         
	         
	         System.out.print("\nEnter choice: ");
	         choice = sc.nextInt();

	         switch(choice) {

	             case 1:
	                 System.out.print("Enter element: ");
	                 e = sc.nextInt();
	                 obj.addLast(e);
	                 break;

	             case 2:
	                 if(!obj.isEmpty()) {
	                     System.out.print("Dequeued Element: "+ obj.removeFirst());
	                 } else {

	                     System.out.print("Queue Empty");
	                 }
	                 break;
	                 
	             case 3:
	                 if(!obj.isEmpty()) {
	                     System.out.print("Queue has: " + obj);

	                 } else {
	                     System.out.print("Queue Empty");
	                 }

	                 break;

	             case 4:
	            	 if(!obj.isEmpty()) {
	            		 System.out.println("At_Front: " + obj.getFirst());	            		
	            	 }
	            	 else {
	                     System.out.print("Queue Empty");
	                 }
	            	 break;

	             case 5:
	            	 if(!obj.isEmpty()) {
	            		 System.out.println("At_Front: " + obj.getLast());
	            	 }
	            	 else {

	                     System.out.print("Queue Empty");
	                 }
	            	 break;

	             case 0:
	                 System.out.print("\nExiting...");
	                 break;
	                 
	             default:
	                 System.out.print("Invalid choice");
	         }

	     } while(choice != 0);
	 }
	}	
	 