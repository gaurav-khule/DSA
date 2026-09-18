package empmanagement;

import java.util.Scanner;

/*
Create a perfect employee management system using a linked list where employee details 
like employee ID, employee name, and employee gender are stored in a node-like structure of a linked list. 
The functionality should be menu-driven, allowing:

adding a new employee
deleting an employee
searching for an employee
listing all employees

 */

class Employee{
	private int emp_id;
	private String name, gender;
	
	Employee(int emp_id, String name, String gender) {
		this.emp_id = emp_id;
		this.name = name;
		this.gender = gender;
	}
	
	//method to display
	void display() {
		System.out.println("\nEmployee ID :" + emp_id);
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
	}
	
	//method to get employee id
	int get_id() {
		return emp_id;
	}
}

//create the Enode that has data as Employee and reference as next

class Enode{
	Employee data;
	Enode next;
	
	Enode(Employee data) {
	this.data = data;
	this.next = null;
	}
}
	
public class Employee_Management {
	 	
		Enode root;
	    void insert(Employee data)//right
	    {
	            Enode n=new Enode(data);
	            if(root==null)
	                root=n;//1
	            else
	            {
	                Enode t=root;//1
	                while(t.next!=null)//not at end 2
	                    t=t.next;
	                t.next=n;//3 
	            }
	        }
	    
	    void print_list()
	    {
	        if(root==null)
	            System.out.println("\nEmpty list. ");
	        else
	        {
	            Enode t=root;//1
	            while(t!=null)//2
	            {
	            	t.data.display();
	                t=t.next;
	            }
	        }
	    }
	    
	    void delete_Employee()
	    {
	        if(root==null)
	            System.out.println("Empty list");
	        else
	        {
	            Enode t= root;//1st
	            root=root.next;//2
	            System.out.println("Deleted: "+t.data);//3
	        }
	    }
	    
	    void search_emp(int empid)//key is element to search
	    {
	        if(root==null)
	            System.out.println("\nEmpty list. ");
	        else
	        {
	            Enode t=root;//1
	            while(t!=null)//2
	            {
	               if(t.data.get_id() ==empid)
	                   break;
	                t=t.next;
	            }
	            if(t==null)
	                System.out.println("\n"+empid+" not found");
	            else
	                System.out.println("\n"+empid+" found");
	        }
	    }

	public static void main(String[] args) {
		Employee_Management obj = new Employee_Management();
		
//		obj.insert(new Employee(1, "Alex", "Male"));
//		obj.insert(new Employee(2, "Harry", "Male"));
//		obj.insert(new Employee(3, "Megan", "Female"));
//		obj.print_list();
		
		Scanner sc = new Scanner(System.in);
		int choice, e;
		
        do {
            System.out.println("\n\n===== Employee Menu =====");
            System.out.println("1. Insert Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Searching Employee");
            System.out.println("4. Print Employee");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();
                    
                    obj.insert(new Employee(id, name, gender));
                    break;

                case 2:
                	obj.delete_Employee();
                    System.out.println("Employee Deleted Successfully");
                    break;
                case 3:
                	e = sc.nextInt();
                    obj.search_emp(e);
                    break;

                case 4:
                    System.out.println("Employee Details");
                    obj.print_list();
                    break;

                case 0:
                    System.out.println("Thank You!!");
                    break;

                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        } while (choice != 0);
	}
}
