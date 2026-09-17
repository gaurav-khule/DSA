package dsa_day02_VandanaMaam;

public class StackExample {
	int tos,Maxsize;
	int stack[];
	
	void createStack(int size) {
		Maxsize = size;
		tos = -1;
		stack = new int[Maxsize];
	}
	
	void Push(int data) {
		tos++;
		stack[tos] = data;;
	}
	
	boolean checkIsFull() {
		if(tos == Maxsize-1) {
			return true;
		}
		return false;
	}
	
	int pop() {
		int temp = stack[tos];
		tos--;
		return temp;
	}
	
	boolean isEmpty() {
		if(tos == -1) {
			return true;
		}else
			return false;
	}
	
	int peek() {
		return stack[tos];
	}
	
	void printStack() {
		for(int i=tos; i>=0; i--) {
			System.out.print("\n" + stack[i]);
		}
	}
	
}
