package linkedlist;

import java.util.Scanner;

//Create a menu-driven program calling all methods. 

public class Linear_linked_List
{
	
  public Linear_linked_List() {
		
	}

  //LinkedList only has one permanent data member called `root`.
  Node root;
  //Root is never created but assigned.
  //The first or the leftmost element of a linked list
  // will be called and recorded as root.
  void insert_left(int data)
  {
      Node n=new Node(data);
      if(root==null)
          root=n;//1
      else
      {
          n.next=root;//1
          root=n;//2
      }
  }
  void insert_right(int data)
  {
      Node n=new Node(data);
      if(root==null)
          root=n;//1
      else
      {//go to right most and link the new node
          Node t=root;//1
          while(t.next!=null)//not at end 2
              t=t.next;
          t.next=n;//3 linked to last/rightmost
      }
  }
  void delete_left()
  {
      if(root==null)
          System.out.println("Empty list");
      else
      {
          Node t= root;//1st
          root=root.next;//2
          System.out.println("Deleted:"+t.data);//3
      }
  }

  void delete_right()
  {
      if(root==null)
          System.out.println("Empty list");
      else
      {
          Node t= root;//1st
          Node t2=root;//1st
          while(t.next!=null)//2
          {
             t2=t;//tail
             t=t.next;//forward
          }
          if(t==t2)
              root=null;//manual deletion
          else
              t2.next=null;//3
          System.out.println("Deleted:"+t.data);//3
      }
  }
  void print_list()
  {
      if(root==null)
          System.out.println("\nEmpty list. ");
      else
      {
          Node t=root;//1
          while(t!=null)//2
          {
              System.out.print("|"+t.data+"|->");
              t=t.next;
          }
      }
  }
  void search_list(int key)//key is element to search
  {
      if(root==null)
          System.out.println("\nEmpty list. ");
      else
      {
          Node t=root;//1
          while(t!=null)//2
          {
             if(t.data==key)
                 break;//sTop if element fun
              t=t.next;
          }
          if(t==null)
              System.out.println("\n"+key+" not found");
          else
              System.out.println("\n"+key+" found");
      }
  }
  
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int choice,e;
	 
	 Linear_linked_List ls = new Linear_linked_List();
	 
	 do {
		 System.out.print("\nLinkedList Menu: ");
		 System.out.print("---------------------------");
		 System.out.print("\n1.Add element in left");
		 System.out.print("\n2.Add element in right");
		 System.out.print("\n3.Delete from left");
		 System.out.print("\n4.Delete from right");
		 System.out.print("\n5.Search element");
		 System.out.print("\n6.Print");
		 System.out.print("\n0.Exit");
		 
		 System.out.print("\nEnter your choice: ");
		 choice = sc.nextInt();
		 
		 switch(choice) {
		 case 1:
			 System.out.print("Enter element: ");
			 e = sc.nextInt();
			 ls.insert_left(e);
			 break;
		 case 2:
			 System.out.print("Enter element: ");
			 e = sc.nextInt();
			 ls.insert_right(e);
			 break;
		 case 3:
			 ls.delete_left();
			 break;
		 case 4:
			 ls.delete_right();
			 break;
			 
		 case 5:
			 System.out.print("Enter Key: ");
			 e =sc.nextInt();
			 ls.search_list(e);
			 break;
		 case 6:
			 ls.print_list();
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
