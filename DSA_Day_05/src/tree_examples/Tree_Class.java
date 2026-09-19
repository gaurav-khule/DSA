package tree_examples;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_Class {
	Node root;
	
	//We are passing a root reference and a new node.
	void insert_node(Node r, Node n) {
		if(root==null) {
			root=n;
		}
		else {
			if(n.data<r.data) {
				if(r.left == null)
					r.left = n;
				else
				insert_node(r.left,n);
			}
			else
				if(r.right == null)
					r.right = n;
				else
				insert_node(r.right,n);
		}
	}
	
	  void inorder(Node r)
	    {
	        if(r!=null)
	        {
	            inorder(r.left);//l
	            System.out.print(r.data+", "+"");//p
	            inorder(r.right);//r
	        }
	    }
	  
	  void preorder(Node r) {
		  if(r!=null) {
			  System.out.print(r.data+", "+"");
			  preorder(r.left);
			  preorder(r.right);
		  }
	  }
	  
	  void postorder(Node r) {
		  if(r!=null) {
			  postorder(r.left);
			  postorder(r.right);
			  System.out.print(r.data+", "+"");
		  }
	  }
	    int count_nodes(Node r)
	    {
	        if(r==null)
	            return 0;
	        return 1+count_nodes(r.left)+count_nodes(r.right);
	    }
	    
	    //Write code to count only leaf nodes. 
	    int count_leaf(Node r) {
	    	if(r==null)
	    		return 0;
	    	if(r.right == null && r.left == null)
	    		return 1;
	    	
	    	return count_leaf(r.left)+count_leaf(r.right);   			
	    }
	    
	    int sumof_tree(Node r) {
	    	if(r==null)
	    		return 0;
	    	return r.data+sumof_tree(r.left)+sumof_tree(r.right);
	    }
	    void level_order(Node r){
	    	if(r == null)
	    		return;
	    	
	    	Queue<Node> q=new LinkedList<>();
        	q.add(r);//1
        	while(!q.isEmpty()){        		
            Node temp=q.remove();
            System.out.print(temp.data+",");
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
    }
	 
	    Node get_root()
	    {
	        return root;
	    }

	    public static void main(String[] args) {
	        Tree_Class obj=new Tree_Class();
	        obj.insert_node(obj.get_root(),new Node(10));
	        obj.insert_node(obj.get_root(),new Node(5));
	        obj.insert_node(obj.get_root(),new Node(15));
	        obj.insert_node(obj.get_root(),new Node(25));
	        obj.insert_node(obj.get_root(),new Node(20));
	        
	        System.out.println("\nInorder: ");
	        obj.inorder(obj.get_root());
	        System.out.print("\nTotal Count: " + obj.count_nodes(obj.get_root()));
	        System.out.print("\nTotal leaf: " + obj.count_leaf(obj.get_root()));
	        
	        System.out.println("\nTotal sum: "+obj.sumof_tree(obj.get_root()));
	        
	        System.out.println("\nLevel order traversal:");
	        obj.level_order(obj.get_root());

	        
	        System.out.println("\n\nPreOrder: ");
	        obj.preorder(obj.get_root());
	        System.out.println("\n\nPostOrder: ");
	        obj.postorder(obj.get_root());
	    }
	}
