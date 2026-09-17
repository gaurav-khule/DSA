package queue;

import java.util.Scanner;

public class Circular_Queue_Class {

    private int queue[], front, rear, MaxSize, count;

    // Create Circular Queue
    public void createQueue(int size) {

        MaxSize = size;

        rear = -1;

        front = 0;

        count = 0;

        queue = new int[MaxSize];
    }


    // ENQUEUE
    void enqueue(int e) {

        // Move rear circularly
        rear = (rear + 1) % MaxSize;

        // Increase number of elements
        count++;

        // Insert element
        queue[rear] = e;
    }


    // Check whether Queue is Full
    boolean isFull() {

        return (count == MaxSize);
    }


    // DEQUEUE
    int dequeue() {

        // Store front element
        int temp = queue[front];

        // Move front circularly
        front = (front+ 1) % MaxSize;

        // Decrease count
        count--;

        return temp;
    }


    // Check whether Queue is Empty
    boolean isEmpty() {

        return (count == 0);
    }


    // Display Queue in FIFO order
    void print_queue() {

        int i = front;
        int c = 0;

        while(c < count) {

            System.out.print(queue[i] + " - ");

            // Move index circularly
            i = (i + 1) % MaxSize;

            c++;
        }
    }


    public static void main(String[] args) {

        int size, e, choice;

        Circular_Queue_Class obj =
            new Circular_Queue_Class();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Queue:");
        size = sc.nextInt();

        obj.createQueue(size);

        do {

            System.out.print("\nQueue Menu");
            System.out.print("\n==========");
            System.out.print("\n1.Enqueue");
            System.out.print("\n2.Dequeue");
            System.out.print("\n3.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");

            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    if(!obj.isFull()) {

                        System.out.print("\nEnter Data:");
                        e = sc.nextInt();

                        obj.enqueue(e);

                    } else {

                        System.out.print("\nQueue Full");
                    }

                    break;


                case 2:

                    if(!obj.isEmpty()) {

                        System.out.print(
                            "\n" + obj.dequeue()
                            + " Dequeued"
                        );

                    } else {

                        System.out.print("\nQueue Empty");
                    }

                    break;
                case 3:
                    if(!obj.isEmpty()) {

                        System.out.print("\nQueue has:\n");

                        obj.print_queue();
                    } else {

                        System.out.print("\nQueue Empty");
                    }
                    break;
                case 0:
                    System.out.print("\nExiting code......");
                    break;
                default:
                    System.out.print("\nInvalid choice");
            }

        } while(choice != 0);
    }
}

