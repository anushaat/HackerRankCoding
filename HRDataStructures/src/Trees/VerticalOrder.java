package Trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.tree.TreeNode;

public class VerticalOrder {
	
	public static TreeMap<Integer, ArrayList<Node>> tm = new TreeMap<>();
	public static ArrayList<Integer> al;
	
	
	public static void getVerticalOrder(Node node, Integer hd, TreeMap<Integer, ArrayList<Node>> map){
		if(node == null){
			return;
		}
		
		if(map.get(hd) == null){
		map.put(hd, new ArrayList());
		}
		
		map.get(hd).add(node);
		
		getVerticalOrder(node.left, hd-1, map);
		
		getVerticalOrder(node.right, hd+1, map);
		
	}
	
	public static void printVerticalOrder(TreeMap<Integer, ArrayList<Node>> map){
		
		List<Integer> hds = new ArrayList<Integer>(map.keySet());
		for(Integer i : hds){
			ArrayList<Node> list = map.get(i);
			for(Node node : list){
				System.out.print(node.data + " ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(1);
	    root.left = new Node(2);
	    root.right = new Node(3);
	    root.left.left = new Node(4);
	    root.left.right = new Node(5);
	    root.right.left = new Node(6);
	    root.right.right = new Node(7);
	    root.right.left.right = new Node(8);
	    root.right.right.right = new Node(9);
	    System.out.println("Vertical order traversal is \n");
	    
	    TreeMap<Integer, ArrayList<Node>> map = new TreeMap<>();
	    
	    getVerticalOrder(root, 0, map);
	    printVerticalOrder(map);

	}

}