package dsa_assignment1;

import java.util.Scanner;

public class PlindromewithourImplementation {
int tos,Maxsize;
char[] stack;

void create_stack(int size) {
	Maxsize = size;
	tos = -1;
	stack = new char[size];
}

boolean isFull() {
	if(tos == Maxsize - 1) {
		return true;
	}
	return false;
}

boolean is_empty() {
    return tos == -1;
}

void push(char data) {
	if(!isFull()) {
		tos++;
		stack[tos] = data;
	}
}

char pop() {
    if (!is_empty()) {
        char temp = stack[tos];
        tos--;
        return temp;
    } else {
        return '\0';
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String str = sc.nextLine();

    PlindromewithourImplementation obj = new PlindromewithourImplementation();

    obj.create_stack(str.length());

   
    for (int i = 0; i < str.length(); i++) {
        if (!obj.isFull()) {
            obj.push(str.charAt(i));
        }
    }

    StringBuilder reverse = new StringBuilder();

           while (!obj.is_empty()) {
        reverse.append(obj.pop());
    }

    if (str.equals(reverse.toString())) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not Palindrome");
    }
}
}
