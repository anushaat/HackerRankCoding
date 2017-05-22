package Tries;

import java.util.HashMap;
import java.util.Scanner;

public class Contacts {
	
	private static TrieNode root = new TrieNode();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++){
			String operation = scan.next();
			String name = scan.next();
			
			if(operation.equals("add")){
				add(name);
			}
			else if(operation.equals("find")){
				System.out.println(find(name));
			}
		}
		

	}
	
	public static class TrieNode{
		public HashMap<Character, TrieNode> children = new HashMap<>();
		public int size = 0;
		
		public void addChildIfAbsent(Character ch){
			children.putIfAbsent(ch, new TrieNode());
		}
	}
	
	public static void add(String str){
		TrieNode curr = root;
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			curr.addChildIfAbsent(ch);
			curr = curr.children.get(ch);
			curr.size++;
			
			System.out.println(curr.size);
		}
	}
	
	public static int find(String str){
		TrieNode curr = root;
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(!curr.children.containsKey(ch)){
				return 0;
			}
			else{
				curr = curr.children.get(ch);
			}
		}
		
		return curr.size;
	}
}

