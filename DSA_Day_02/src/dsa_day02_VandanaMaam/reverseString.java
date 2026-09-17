package dsa_day02_VandanaMaam;

public class reverseString {
	static final int MaxSize = 100;
	int tos = -1;
	char[] stack = new char[MaxSize];
	
	
	boolean isEmpty() {
		return tos == -1;
	}
	
	boolean isFull() {
		return tos == MaxSize-1;
	}
	
	void push(char c) {
		if(isFull()) {
			System.out.print("Stack Overflow! Cannot push element");
			return;
		}else {
			stack[++tos] = c;
		}
	}
	
	char pop() {
		if(isEmpty()) {
			System.out.print("Stack Underflow! Cannot pop element");
			return '\0';
		}
		else {
			return stack[tos--];
		}
	}
	
	String revString (String str){
		for(int i=0; i<str.length(); i++) {
			push(str.charAt(i));
		}
		StringBuilder rstr = new StringBuilder();
		while(!isEmpty()) {
			rstr.append(pop());
		}
		return rstr.toString();
	}
}
