package doublylinkedlist;

import java.util.Scanner;

public class Doubly_Linked_List 
{
   Dnode root;
    void insert_left(int data)
    {
    	Dnode n=new Dnode(data);
        if(root==null)
            root=n;//1
        else
        {
            n.right=root;//1
            root.left=n;//2
            root=n;
        }
    }
    
    void insert_right(int data)
    {
    	Dnode n=new Dnode(data);
        if(root==null)
            root=n;//1
        else
        {
        	Dnode t=root;//1
            while(t.right!=null)//not at end 2
                t=t.right;
            	t.right= n;
            	n.left = t;
        }
    }
    
    void delete_left()
    {
        if(root==null)
            System.out.println("Empty list");
        else
        {
        	Dnode t= root;//1st
        	if(root.left == null && root.right == null) {
        		root = null;
        	}
        	else {
        		root=root.right;//2
        		root.left = null;        		
        	}
            System.out.println("Deleted:"+t.data);//3
        }
    }

    void delete_right() {
        if (root == null)
            System.out.print("\nEmpty List");
        else {
            Dnode t, t2;
            t = root;//1
            if (root.right == null)//single node
                root = null;//manual deletion
            else {
                while (t.right != null)//2
                    t = t.right;
                t2 = t.left;//3 ref to pref who is on left
                t2.right = null;//4
                //(t.left).right=null;
            }
            System.out.print("\n|" + t.data + "|-> deleted");
        }
    }

    void print_list() {
        if (root == null)
            System.out.print("\nList Empty");
        else {
            Dnode t = root;
            System.out.print("NULL");
            while (t != null) {
                System.out.print("<-|" + t.data + "|->");
                t = t.right;
            }
            System.out.print("NULL");
        }
    }

    
    void print_reverse_list()
    {
        if(root==null)
            System.out.println("\nEmpty list. ");
        else
        {
        	Dnode t=root;//1
        	System.out.println("NULL");
            while(t.right!=null)//2
            {
                t=t.right;
            }
            while(t != null) {
            	System.out.println("|"+t.data+"|->");
            	t = t.left;
            }
            System.out.println("NULL");
        }
    }
    
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 int choice,e;
    	 
    	 Doubly_Linked_List db = new Doubly_Linked_List();
    	 
    	 do {
    		   System.out.print("\n\n===== Doubly Linked List Menu =====");
               System.out.print("\n1. Insert Left");
               System.out.print("\n2. Insert Right");
               System.out.print("\n3. Delete Left");
               System.out.print("\n4. Delete Right");
               System.out.print("\n5. Print List");
               System.out.print("\n6. Print Reverse List");
               System.out.print("\n0. Exit");
               System.out.print("\nEnter choice: ");
    		 
    		 System.out.print("\nEnter your choice: ");
    		 choice = sc.nextInt();
    		 
    		 switch(choice) {
    		 case 1:
    			 System.out.print("Enter element: ");
    			 e = sc.nextInt();
    			 db.insert_left(e);
    			 break;
    		 case 2:
    			 System.out.print("Enter element: ");
    			 e = sc.nextInt();
    			 db.insert_right(e);
    			 break;
    		 case 3:
    			 db.delete_left();
    			 break;
    		 case 4:
    			 db.delete_right();
    			 break;
    			 
    		 case 5:
    			 db.print_reverse_list();
    			 break;
    		 case 6:
    			 db.print_list();
    			 break;
    		 case 0:
    			 System.out.print("Thank You!!");
    			 break;
    		default :
    			System.out.println("INVALID CHOICE");
    			break;
    		 }
    	 }while(choice != 0);
      }
	}
