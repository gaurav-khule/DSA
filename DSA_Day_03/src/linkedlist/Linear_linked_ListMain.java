package linkedlist;

public class Linear_linked_ListMain {
	public static void main(String[] args) {
		Linear_linked_List obj = new Linear_linked_List();
		System.out.println("After insertion left: ");
		obj.insert_left(10);
		obj.insert_left(20);
		obj.insert_left(30);
		obj.print_list();
		
		System.out.println("After insertion right: ");
		obj.insert_right(40);
		obj.insert_right(50);
		obj.insert_right(60);
		obj.print_list();
		
		System.out.println("After delete left");
		obj.delete_left();
		System.out.println("After delete right");
		obj.delete_right();
		
		System.out.println("Diplay list: ");
		obj.print_list();
		
		System.out.println("Search element: ");
		obj.search_list(10);
	}
}
