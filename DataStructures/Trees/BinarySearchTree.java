
public class BinarySearchTree {
	Node root;
	
	public void insertNode(int data) {
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
		}
		Node currentNode = root;
		while(currentNode.left !=null || currentNode.right!=null) {
			if(data<currentNode.data) {
				currentNode = currentNode.left;
			}
			else if(data>currentNode.data) {
				currentNode = currentNode.right;
			}
		}
		if(data<currentNode.data) {
			currentNode.left = newNode;
		}
		else {
			currentNode.right = newNode;
		}
		
	}
	
	public void inOrder(Node node) {
		if(node !=null) {
			inOrder(node.left);
			System.out.printf("%d ",node.data);
			inOrder(node.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new Node(6);
		tree.root.left = new Node(2);
		tree.root.right = new Node(8);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(4);
		tree.root.left.left.left = new Node(3);
		
		tree.insertNode(5);
		tree.inOrder(tree.root);
		//System.out.println(tree.root);
		

	}

}
