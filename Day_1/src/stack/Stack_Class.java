package stack;

import java.util.Scanner;

public class Stack_Class {
	private int tos, MaxSize;
	private int stack[];
	
	public void createStack(int size) {
		int MaxSize = size;
		tos = -1;
		stack = new int[MaxSize];
	}
	
	//Push
	void push(int e) {
		tos++;
		stack[tos] = e;
//		stack[++tos] = data;
	}
	
	//Check weather stack is full
	boolean is_full() {
		if(tos == MaxSize-1)
			return true;
	else 
		return false;
	//return(tos==maxSize-1)
	}
	
	//Remove element
	int pop() {
		int temp = stack[tos];
		tos--;
		return temp;
	}
	
	//Check weather stack is empty
	boolean is_empty() {
		if (tos == -1)
			return true;
		else 
			return false;
	}
	
	//peek() 
	int peek() {
		return (stack[tos]);
	}
	
	//Print Stack
	void print_stack() {
		for(int i=tos; i>=0; i--) {
			System.out.print("\n" + stack[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack_Class obj = new Stack_Class();
		
		System.out.print("\nEnter size of stack: ");
		int size = sc.nextInt();
		
		int choice = 0, e;
		
		obj.createStack(size);
		
		do {
			System.out.print("\n Stack Menu: ");
			System.out.print("\n-------------");
			System.out.print("\n1.Push");
			System.out.print("\n2.Pop");
			System.out.print("\n3.Peek");
			System.out.print("\n4.Print");
			System.out.print("\n0.Exit");
	        System.out.print("\n:");

			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(!obj.is_full()) {
					System.out.print("\nEnter element to push");
					e = sc.nextInt();
					obj.push(e);
				}
				else {
					System.out.print("\nStack is full");
				}
				break;
				
			 case 2:

                 if(!obj.is_empty())
                 {
                     System.out.print(
                         "\nElement popped:" + obj.pop());
                 }
                 else
                 {
                     System.out.print("\nStack Empty");
                 }

                 break;

             case 3:

                 if(!obj.is_empty())
                 {
                     System.out.print(
                         "\nElement @ Peek:" + obj.peek()
                     );
                 }
                 else
                 {
                     System.out.print("\nStack Empty");
                 }

                 break;

             case 4:

                 if(!obj.is_empty())
                 {
                     System.out.print("\nElements on Stack:\n");

                     obj.print_stack();
                 }
                 else
                 {
                     System.out.print("\nStack Empty");
                 }

                 break;

             case 0:
                 System.out.print("\nExiting code...");
                 break;

             default:
                 System.out.print("\nInvalid option selected.");
         }

		}while(choice != 4);
	}
}
