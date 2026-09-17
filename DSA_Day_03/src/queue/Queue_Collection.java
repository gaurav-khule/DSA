package queue;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Queue_Collection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Queue using LinkedList
        Queue<Integer> obj = new LinkedList<Integer>();

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

                    // Read element
                    System.out.print("Enter element: ");
                    e = sc.nextInt();

                    // Insert element into Queue
                    obj.offer(e);

                    break;


                case 2:

                    // Check Queue is NOT Empty
                    if(!obj.isEmpty()) {

                        // Remove front element
                        System.out.print("Dequeued Element: "+ obj.poll()
                        );

                    } else {

                        System.out.print("Queue Empty");
                    }

                    break;


                case 3:

                    // Display Queue
                    if(!obj.isEmpty()) {

                        System.out.print("Queue has: " + obj);

                    } else {

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

