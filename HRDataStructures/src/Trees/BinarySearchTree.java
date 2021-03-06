package Trees;

public class BinarySearchTree {
	
	// Root node pointer. Will be null for an empty tree. 
	
	private static Node root;
	
	/* Creates an empty binary tree*/
	
	public BinarySearchTree(){
		root = null;
	}

	/* Inserts the given value into the binary search tree*/
	
	public void insert(int data){
		root = insert(root, data);
	}
	
	/** 
	   Recursive insert -- given a node pointer, recur down and 
	   insert the given data into the tree. Returns the new 
	   node pointer (the standard way to communicate 
	   a changed pointer back to the caller). 
	  */ 
	
	private Node insert(Node node, int data){
		if(node == null){
			node = new Node(data);
		}
		else{
		
			if(data < node.data){
				node.left = insert(node.left, data);
			}
			else{
				node.right = insert(node.right, data);
			}
		}
		
		return node;
	}
	
	/** 
	   Returns true if the given target is in the binary tree. 
	   Uses a recursive helper. 
	  */ 
	
	public boolean contains(int data){
		return contains(root, data);
	}
	
	/** 
	   Recursive lookup  -- given a node, recur 
	   down searching for the given data. 
	  */ 
	
	private boolean contains(Node node, int data){
		if(node == null){
			return false;
		}
		
		if(data == node.data){
			return true;
		}
		else if(data < node.data){
			return contains(node.left, data);
		}
		else{
			return contains(node.right, data);
		}
	}
	
	
	public void printInOrder(Node node){
		if(node == null){
			return;
		}
		
		printInOrder(node.left);
		
		System.out.print(node.data + " ");
		
		printInOrder(node.right);
	}
	
	
	public void printPreOrder(Node node){
		if(node == null){
			return;
		}
		
		System.out.print(node.data + " ");
		
		printPreOrder(node.left);
		
		printPreOrder(node.right);
	}
	
	public void printPostOrder(Node node){
		if(node == null){
			return;
		}
		
		printPostOrder(node.left);
		
		printPostOrder(node.right);
		
		System.out.print(node.data + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(25);
		bst.insert(15);
		bst.insert(50);
		bst.insert(10);
		bst.insert(22);
		bst.insert(35);
		bst.insert(70);
		bst.insert(4);
		bst.insert(12);
		bst.insert(18);
		bst.insert(24);
		bst.insert(31);
		bst.insert(44);
		bst.insert(66);
		bst.insert(90);
		
		System.out.println(bst.contains(3));
		System.out.println(bst.contains(90));
		
		bst.printInOrder(root);
		System.out.println();
		bst.printPreOrder(root);
		System.out.println();
		bst.printPostOrder(root);
		
		

	}

}
