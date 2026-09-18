package doublylinkedlist;

import java.util.LinkedList;
import java.util.Scanner;


public class RotateList {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.print("\nList has: " + list);
		System.out.print("\nEnter number of rotation: ");
		int r = sc.nextInt();
		
		for(int i=1; i<=r; i++) {
//			list.addLast(list.removeFirst());
			list.addFirst(list.removeLast());
			System.out.print("\nPass "+i+"\tList: " + list);
		}
	}
}
