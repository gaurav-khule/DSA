package dsa_assignment1;

public class StackExample1 {
	int tos;
	int Maxsize;
	int stack[];
	
	
	void createStack(int size) {
		tos=-1;
		Maxsize = size;
		stack = new int[Maxsize];
	}
	
	
	//push
	void push(int data) {
		tos++;
		stack[tos] = data;
	}
	
	//Is full
	boolean isFull() {
		if(tos == Maxsize-1) {
			return true;
		}
		return false;
	}
	
	boolean isEmpty() {
		if(tos == -1) {
			return true;
		}
		return false;
	}
	
	//pop
	int pop() {
		int temp = stack[tos];
		tos--;
		return temp;
	}
	
	void print() {
		for(int i=tos; i>=0; i--) {
			System.out.print(stack[i]+",");
		}
	}
}
