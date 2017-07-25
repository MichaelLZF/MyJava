package data.structure;

import java.util.Scanner;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}
}
public class Tree {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] arg){
		
	}
	public TreeNode createTree(TreeNode root){
		String val;
		val = sc.next();
		if(val.equals("#")){
			return null;
		}
		root = new TreeNode(Integer.valueOf(val));
		root.left = createTree(root.left);
		root.right = createTree(root.right);
		return root;
	}
	public TreeNode invertTree(TreeNode root){
		if(root==null){
			return null;
		}
		if(root.left!=null){
			invertTree(root.left);
		}
		if(root.right!=null){
			invertTree(root.right);
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		return root;
	}
}
