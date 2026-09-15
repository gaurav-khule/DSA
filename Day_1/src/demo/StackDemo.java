package demo;

import java.util.Scanner;

public class StackDemo {
	private int tos, MaxSize;
	private int stack[];
	
	
	//Stack creation
	public void createStack(int size) {
		int maxSize = size;
		tos = -1;
		stack =new int[size];
	}
	
	
	//Push
	public void Push(int data) {
		tos++;
		stack[tos] = data;
	}
	
	//Weather stack is full
	boolean checkisFull() {
		if(tos == MaxSize-1) {
			return true;
		}
		return false;
	}
	
	
	//Pop
	public int pop() {
		int temp = stack[tos];
		tos--;
		return temp;
	}
	
	//Check weather stack is empty
	boolean checkisEmpty() {
		if(tos == -1) {
			return true;
		}
		return true; 
	}
	
	//peek
	int peek() {
		return stack[tos];
	}
	
	//Print stack
	public void printStack() {
		for(int i=tos; i>=0; i--) {
			System.out.print(stack[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackDemo obj = new StackDemo();
		int choice, e;
		
		System.out.print("\nEnter size of stack: ");
		int size = sc.nextInt();
		
		obj.createStack(size);
		
		do {
			System.out.print("\nStack Menu..");
			System.out.print("-----------------");
			System.out.print("\n1.Push");
			System.out.print("\n2.Pop");
			System.out.print("\n3.Peek");
			System.out.print("\n4.Print");
			System.out.print("\n0.Exit");
			System.out.print("\n");
			
		System.out.print("\nEnter your choice: ");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			if(!obj.checkisFull()) {
				System.out.print("\nEnter element: ");
				e = sc.nextInt();
				obj.Push(e);
			}else {
				System.out.print("\nStack is full");
			}
			break;
			
		case 2:
			if(!obj.checkisEmpty()) {
				
				System.out.print("\nElement Poped is: " + obj.pop());
			}else {
				System.out.print("\nStack is empty");
			}
			break;
		case 3:
			if(!obj.checkisEmpty()) {
				System.out.print("\nElement Peek is: " + obj.peek());
			}
			else {
				System.out.println("\nStack is empty");
			}
			break;
		case 4:
			if(!obj.checkisEmpty()) {
				System.out.print("--Stack--");
				obj.printStack();
			}else {
				System.out.println("\nStack is empty");
			}
			break;
		case 0:
			System.out.println("\nThank You!!!");
			break;
		default :
			System.out.print("\nInvalid choice!!");
			break;
		}
		}while(choice != 0);
	}
}