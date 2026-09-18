package sortlinkedlist;

import java.util.Scanner;

public class SortLinkedList {

    Node root;

    // Insert element at left
    void insert_left(int data) {
        Node n = new Node(data);

        if (root == null) {
            root = n;
        } else {
            n.next = root;
            root = n;
        }
    }

    // Print original list
    void print_list() {
        if (root == null) {
            System.out.println("\nEmpty list.");
        } else {
            Node t = root;

            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }

            System.out.println("NULL");
        }
    }

    // Sort linked list
    void sort_list() {

        if (root == null) {
            System.out.println("\nEmpty list.");
            return;
        }

        // Outer loop - passes
        for (Node i = root; i.next != null; i = i.next) {

            // Inner loop - comparison
            for (Node j = root; j.next != null; j = j.next) {

                if (j.data > j.next.data) {

                    // Swap data, not nodes
                    int temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
        }
    }

    // Print sorted list
    void print_sort_list() {
        if (root == null) {
            System.out.println("\nEmpty list.");
        } else {
            Node t = root;

            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }

            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice, e;

        SortLinkedList obj = new SortLinkedList();

        do {
            System.out.println("\n\n===== Singly Linked List Menu =====");
            System.out.println("1. Insert Left");
            System.out.println("2. Print List");
            System.out.println("3. Sort List");
            System.out.println("4. Print Sorted List");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element: ");
                    e = sc.nextInt();

                    obj.insert_left(e);
                    break;

                case 2:
                    System.out.println("Original List:");
                    obj.print_list();
                    break;

                case 3:
                    obj.sort_list();
                    System.out.println("List sorted successfully.");
                    break;

                case 4:
                    System.out.println("Sorted List:");
                    obj.print_sort_list();
                    break;

                case 0:
                    System.out.println("Thank You!!");
                    break;

                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }

        } while (choice != 0);

        sc.close();
    }
}
