package queue;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Bin_To_Dec {

    static int to_dec(String bin) {

        // Create Character Queue
        Queue<Character> queue = new LinkedList<Character>();

        // Insert each binary digit into Queue
        for(char bit : bin.toCharArray()) {

            // Add element to Queue
            queue.offer(bit);
        }

        System.out.print("\nQueue has:" + queue);

        int sum = 0 ;

        // Process Queue until empty
        while(!queue.isEmpty()) {

            // Remove front character
            char c = queue.poll();

            // Convert character to integer
            int digit = c-'0'; //  convers single character digit to int

            // Calculate decimal value
            sum = (int) (sum + (digit * Math.pow(2,queue.size()))
            );
        }

        return sum;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Binary Number:");

        String bin = sc.nextLine();

        int dec = to_dec(bin);

        System.out.println(
            "Number is Decimal:" + dec
        );
    }
}

