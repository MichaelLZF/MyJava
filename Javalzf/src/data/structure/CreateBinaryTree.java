package data.structure;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CreateBinaryTree {
	  public static void main(String[] args) {  
	        CreateBinaryTree binTree = new CreateBinaryTree();  
	        binTree.createBinTree();  
	        // nodeList中第0个索引处的值即为根节点  
	        Node root = nodeList.get(0);  
	        Node root2 = nodeList.get(1);
//	        System.out.println("先序遍历：");  
//	        preOrderTraverse(root);  
//	        System.out.println();  
//	  
//	        System.out.println("中序遍历：");  
//	        inOrderTraverse(root);  
//	        System.out.println();  
//	  
//	        System.out.println("后序遍历：");  
//	        postOrderTraverse(root); 
//	        System.out.println();
//	        
//	        System.out.println("层次遍历：");
//	        levelOrder();
//	        System.out.println();
//	        
//	        System.out.println("count:"+countNode(root));
//	        System.out.println("countleaves:"+countLeaves(root));
//	        System.out.println("depth:"+getDepth(root));
//	        System.out.println("Kleaves:"+getKlevel(root,3));
//	        System.out.println("structure:"+structrueCmp(root,root2));
	        System.out.println(findnode(root,nodeList.get(7),nodeList.get(8)).data);
	  }
    private static List<Node> nodeList = null;
	public static class Node{
		Node leftChild;
		Node rightChild;
		int data;
		Node(int newData){
			leftChild = null;
			rightChild = null;
			data = newData;
		}
	}
	public void createBinTree(){
//		Scanner sc = new Scanner(System.in);
//		String[] s = sc.nextLine().split("\\s+");
//		int[] array = new int[s.length];
//		for(int i = 0;i<s.length;i++){
//			array[i] = Integer.valueOf(s[i]);
//		}
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		nodeList = new LinkedList<Node>();
		for(int nodeIndex = 0;nodeIndex<array.length;nodeIndex++){
			nodeList.add(new Node(array[nodeIndex]));
		}
		for(int parentIndex = 0;parentIndex<array.length/2-1;parentIndex++){
			nodeList.get(parentIndex).leftChild = nodeList.get(parentIndex*2+1);
			nodeList.get(parentIndex).rightChild = nodeList.get(parentIndex*2+2);
		}
		int lastParentIndex = array.length/2-1;
		nodeList.get(lastParentIndex).leftChild = nodeList  
                .get(lastParentIndex * 2 + 1);  
        // 右孩子,如果数组的长度为奇数才建立右孩子  
        if (array.length % 2 == 1) {  
            nodeList.get(lastParentIndex).rightChild = nodeList  
                    .get(lastParentIndex * 2 + 2);  
        } 
	}
	 /** 
     * 先序遍历 
     *  
     * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已 
     *  
     * @param node 
     *            遍历的节点 
     */  
    public static void preOrderTraverse(Node node) {  
        if (node == null)  
            return;  
        System.out.print(node.data + " ");  
        preOrderTraverse(node.leftChild);  
        preOrderTraverse(node.rightChild);  
    }  
  
    /** 
     * 中序遍历 
     *  
     * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已 
     *  
     * @param node 
     *            遍历的节点 
     */  
    public static void inOrderTraverse(Node node) {  
        if (node == null)  
            return;  
        inOrderTraverse(node.leftChild);  
        System.out.print(node.data + " ");  
        inOrderTraverse(node.rightChild);  
    }  
  
    /** 
     * 后序遍历 
     *  
     * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已 
     *  
     * @param node 
     *            遍历的节点 
     */  
    public static void postOrderTraverse(Node node) {  
        if (node == null)  
            return;  
        postOrderTraverse(node.leftChild);  
        postOrderTraverse(node.rightChild);  
        System.out.print(node.data + " ");  
    }  
    
    /**
     * 层次遍历
     * @param args
     */
    public static void levelOrder(){
    	for(Node node1:nodeList){
    		System.out.print(node1.data+" ");
    	}
    }
    /**
     * 求树的节点数
     */
    public static int countNode(Node node){
    	if(node == null){
    		return 0;
    	}else{
    		return countNode(node.leftChild)+
    				countNode(node.rightChild)+1;
    	}
    }
    /**
     * 求树的叶子数
     * 没有左右孩子的节点
     */
    public static int countLeaves(Node node){
    	if(node==null){
    		return 0;
    	}
    	if(node.leftChild==null && node.rightChild==null){
    		return 1;
    	}
    	else{
    		return countLeaves(node.leftChild)+
    				countLeaves(node.rightChild);
    	}
    }
    /**
     * 求数的深度
     */
    public static int getDepth(Node node){
    	if(node==null){
    		return 0;
    	}
    	int left_depth = getDepth(node.leftChild)+1;
    	int right_depth = getDepth(node.rightChild)+1;
    	return left_depth>right_depth? left_depth:right_depth;
    }
    /**
     *
     * @param node
     * @param k层的节点个数
     * @return
     */
    public static int getKlevel(Node node,int k){
    	if(node ==null){
    		return 0;
    	}
    	if(k ==1){
    		return 1;
    	}
    	return getKlevel(node.leftChild,k-1)+
    			getKlevel(node.rightChild,k-1);
    }
    /**
     * 判断两个二叉树的结构是否相同
     * @param node1
     * @param node2
     * @return
     */
    public static boolean structrueCmp(Node node1,Node node2){
    	if(node1 ==null && node2 ==null){
    		return true;
    	}else if(node1 ==null ||node2 ==null){
    		return false;
    	}
    	return structrueCmp(node1.leftChild,node2.leftChild)
    			&& structrueCmp(node1.rightChild,node2.rightChild);
    }
    /**
     * 镜像二叉树
     * @param node
     */
    public static void Mirror(Node node){
    	if(node ==null){
    		return;
    	}
    	Node temp = null;
    	temp = node.leftChild;
    	node.leftChild = node.rightChild;
    	node.rightChild = temp;
    	Mirror(node.leftChild);
    	Mirror(node.rightChild);
    }
    /**
     * 最低公共祖先节点
     * @param node
     * @param tar1
     * @param tar2
     * @return
     */
    public static Node findnode(Node node,Node tar1,Node tar2){
    	if(node ==null){
    		return null;
    	}
    	if(node==tar1 || node ==tar2){
    		return node;
    	}
    	Node left = findnode(node.leftChild,tar1,tar2);
    	Node right = findnode(node.rightChild,tar1,tar2);
    	if(left ==node.leftChild && right==node.rightChild){
    		return node;
    	}
    	return left==node.leftChild ? left :right;
    }
}
