import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {
	Node root;
	
	public int size() {
		int count =0;
		if(root == null) {
			return count;
		}
		Queue<Node> que = new LinkedList<Node>();
		que.add(root);
		
		while(!que.isEmpty()) {
			Node currentNode = que.poll();
			count++;
			if(currentNode.left !=null) {
				que.add(currentNode.left);
			}
			if(currentNode.right !=null) {
				que.add(currentNode.right);
			}
		}
		return count;
	}
	
	public void levelOrder() {
		System.out.println("\nLevel Order Traversal: ");
		if(root == null)
			return;
		Queue<Node> que = new LinkedList<Node>();
		que.add(root);
		
		while(!que.isEmpty()) {
			Node currentNode = que.poll();
			System.out.printf("%d ",currentNode.data);
			
			if(currentNode.left !=null & currentNode.right != null) {
				que.add(currentNode.left);
				que.add(currentNode.right);
			}
		}
	}
	
	public void postOrderTraversal() {
		System.out.println("Post Order: ");
		if(root == null) {
			return;
		}
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		
		stack1.push(root);
		while(!stack1.isEmpty()) {
			Node currentNode = stack1.pop();
			stack2.push(currentNode);
			if(currentNode.left !=null & currentNode.right !=null) {
				stack1.push(currentNode.left);
				stack1.push(currentNode.right);				
			}			
		}
		
		while(!stack2.isEmpty()) {
			Node pointer = stack2.pop();
			System.out.printf("%d ",pointer.data);
		}
		
		/*Node currentNode = root;
		//stack.push(currentNode);
		
		while(currentNode != null) {
			stack.push(currentNode);
			currentNode = currentNode.left;
		}
		
		while(!stack.isEmpty()) {
			currentNode = stack.peek();
			currentNode = currentNode.right;
			
			while(currentNode !=null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			System.out.printf("%d ",stack.pop().data);
			
		}*/
	}
	public void inorderTraversal() {
		System.out.println("In Order: ");
		if(root == null)
			return;
		Stack<Node> stack = new Stack<Node>();
		Node currentNode = root;
		while(currentNode != null) {
			stack.push(currentNode);
			currentNode = currentNode.left;
		}
		
		while(!stack.isEmpty()) {
			currentNode = stack.pop();
			System.out.printf("%d ",currentNode.data);
			currentNode = currentNode.right;
			
			while(currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
		}
	}
	
	public void preOrder() {
		System.out.println("\nPre Order:");
		if(root == null)
			return;
		Stack<Node> stack = new Stack<Node>();
		Node currentNode = root;
		stack.push(currentNode);
		while(!stack.isEmpty()) {
			currentNode = stack.pop();
			System.out.printf("%d ", currentNode.data);
			if(currentNode.right !=null && currentNode.left !=null) {
				stack.push(currentNode.right);
				stack.push(currentNode.left);
			}
			
		}
	}
	
	public int heightOfTree(Node node) {
		if(node == null) {
			return 0;
		}
		int leftDepth = heightOfTree(node.left);
		int rightDepth = heightOfTree(node.right);
		
		return (leftDepth>rightDepth ? leftDepth+1 : rightDepth+1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.inorderTraversal();
		/*tree.preOrder();
		tree.postOrderTraversal();
		tree.levelOrder();
		System.out.println("\nSize of tree is : "+tree.size());
		System.out.println("Height of tree is : "+tree.heightOfTree(tree.root));*/
	}

}
