package queue;

import java.util.Scanner;

public class Queue_Class {

    private int front, rear, Maxsize, queue[];

    // Create Queue
    void create_queue(int size) {

        // Initialize front
        front = 0;
        // Initialize rear
        rear = -1;
        Maxsize = size;
        // Create integer array
        queue = new int[Maxsize];
    }

    // ENQUEUE
    void enqueue(int e) {

        // Increment rear and insert element
        queue[++rear] = e;
    }

    // Check whether Queue is Full
    boolean is_full() {

        return (rear == Maxsize-1);
    }

    // DEQUEUE
    int dequeue() {

        // Return element from front
        return (queue[front++]);
    }

    // Check whether Queue is Empty
    boolean is_empty() {

        return (front > rear);
    }

    // Display Queue in FIFO order
    void print_queue() {

        System.out.print("\nQueue Elements (FIFO): ");

        for (int i = front;i <= rear;i++) {

            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue_Class obj = new Queue_Class();

        System.out.print("\nEnter size of Queue: ");
        int size = sc.nextInt();

        // Create Queue
        obj.create_queue(size);

        int choice = 0, e;

        do {

            System.out.print("\n\nQueue Menu");
            System.out.print("\n-----------");
            System.out.print("\n1. Enqueue");
            System.out.print("\n2. Dequeue");
            System.out.print("\n3. Print Queue");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch(choice) {
                case 1:

                    // Check Queue is NOT Full
                    if(!obj.is_full()) {
                        System.out.print("Enter element: ");
                        e = sc.nextInt();
                        obj.enqueue(e);
                    } 
                    else {
                        System.out.print("Queue Full");
                    }
                    break;
                case 2:
                    // Check Queue is NOT Empty
                    if(!obj.is_empty()) {
                        System.out.print("Dequeued Element: " + obj.dequeue());
                    } 
                    else {

                        System.out.print("Queue Empty");
                    }
                    break;
                case 3:
                    // Display Queue
                    if(!obj.is_empty()) {
                        obj.print_queue();;
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