package doublylinkedlist;

public class Dnode {
	int data;
	Dnode right;
	Dnode left;
	
	Dnode(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}
}
