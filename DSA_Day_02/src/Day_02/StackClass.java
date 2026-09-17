package Day_02;
import java.util.Scanner;
import java.util.Stack;

class StackClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Stack
        Stack<Integer> st = new Stack<Integer>();

        int choice;
        int value;

        do {

            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Size");
            System.out.println("6. Search");
            System.out.println("7. Check Empty");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Push
                    System.out.print("Enter value: ");
                    value = sc.nextInt();

                    st.push(value);

                    System.out.println("Element inserted.");
                    break;

                case 2:
                    // Pop
                    if (!st.isEmpty()) {

                        System.out.println("Deleted element: " + st.pop());

                    } else {

                        System.out.println("Stack is Empty.");
                    }

                    break;

                case 3:
                    // Peek
                    if (!st.isEmpty()) {

                        System.out.println(
                            "Top element: " + st.peek());

                    } else {

                        System.out.println("Stack is Empty.");
                    }

                    break;

                case 4:
                    // Display
                    System.out.println("Stack: " + st );

                    break;

                case 5:
                    // Size
                    System.out.println(
                        "Stack Size: " + st.size()
                    );

                    break;

                case 6:
                    // Search
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();

                    int position = st.search(value);

                    if (position == -1) {

                        System.out.println("Element not found.");

                    } else {

                        System.out.println("Element found at position from TOP: "+ position);
                    }

                    break;

                case 7:
                    // Check Empty
                    if (st.isEmpty()) {

                        System.out.println("Stack is Empty.");

                    } else {

                        System.out.println("Stack is NOT Empty.");
                    }

                    break;

                case 8:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 8);
        sc.close();
    }
}


