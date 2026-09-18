package assignment18_09;

import java.util.Scanner;

import linkedlist2.Node;

public class doublyCircularLinkedList {
	
	Dnode root, last;
	void insert_left(int data) {
		Dnode n = new Dnode(data);
		if(root == null) {
			root=last= n;
			last.right=root;
		}
	else {
		n.right = root;
		root.left = n;
		root = n;
		
		last.right= root; 
		root.left = last;
		
		System.out.println("Element added in left");
		}
	}
	
	void insert_right(int data) {
		Dnode n = new Dnode(data);
		if(root == null) {
			root = n;
		}
		
		Dnode t = root;
		while(t.right != null) {
			t=t.right;
			t.right = n;
			n.left = t;
		}
		System.out.println("Insert in right");
	}
	
	void delete_left() {
		Dnode t = root;
		if(root == null) 
			System.out.println("List is Empty");
		if(root.right == null && root.left == null)
			root = null;
		else {
			root.right = root;
			root.left = null;
		}
		System.out.println("Element Deleted from Left: "+t.data);
	}
	
	void delete_right() {
		Dnode t,t2; 
		t = root;
		if(root == null)
			System.out.println("List is Empty");
		if(root.right == null && root.left == null)
			root = null;
		else
			while(t.right != null) {
				t= t.right;
				t2 = t.left;
				t2.right = null;
			}
		System.out.println("Element Deleted from Right: "+t.data);
	}
	
	void print_list()
    {
        if(root == null)
            System.out.print("\nList Empty");
        else
        {
            Dnode t=root;

            do
            {
                System.out.print("|"+t.data+"|->");
                t = t.right;
            }while(t!=root);
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		doublyCircularLinkedList obj = new doublyCircularLinkedList();
		
		int choice,e;
		
		do {
			System.out.println("\n\n----Doubly Circular Linked List ------");
			System.out.println("1.Insert left");
			System.out.println("2.Insert right");
			System.out.println("3.Delete left");
			System.out.println("4.Delete left");
			System.out.println("5.Print");
			System.out.println("0.Exit");
			
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter element: ");
				e = sc.nextInt();
				obj.insert_left(e);
				break;
			case 2:
				System.out.println("Enter element: ");
				e = sc.nextInt();
				obj.insert_right(e);
				break;
			case 3:
				obj.delete_left();
				break;
			case 4:
				obj.delete_right();
				break;
			case 5:
				obj.print_list();
				break;
			case 0:
				System.out.println("Thank you!!");
				break;
			default:
				System.out.println("INVALID CHOICE");
				break;
			}
		}while(choice != 0);
 	}
}
