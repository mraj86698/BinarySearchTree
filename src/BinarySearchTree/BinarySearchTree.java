package BinarySearchTree;

public class BinarySearchTree {

	private BinarySearchTreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	/* Function to check if tree is empty */
	public boolean isEmpty() {
		return root == null;
	}

	/* Functions to insert data */
	public void insert(int data) {
		root = insert(root, data);
	}

	/* Function to insert data recursively */
	private BinarySearchTreeNode insert(BinarySearchTreeNode node, int data) {
		if (node == null)
			node = new BinarySearchTreeNode(data);
		else {
			if (data <= node.getData())
				node.left = insert(node.left, data);
			else
				node.right = insert(node.right, data);
		}
		return node;
	}

	/* Functions to count number of nodes */
	public int countNodes() {
		return countNodes(root);
	}

	/* Function to count number of nodes recursively */
	private int countNodes(BinarySearchTreeNode r) {
		if (r == null)
			return 0;
		else {
			int l = 1;
			l += countNodes(r.getLeft());
			l += countNodes(r.getRight());
			return l;
		}
	}

	/* Functions to search for an element */
	public boolean search(int val) {
		return search(root, val);
	}

	/* Function to search for an element recursively */
	private boolean search(BinarySearchTreeNode r, int val) {
		boolean found = false;
		while ((r != null) && !found) {
			int rval = r.getData();
			if (val < rval)
				r = r.getLeft();
			else if (val > rval)
				r = r.getRight();
			else {
				found = true;
				break;
			}
			found = search(r, val);
		}
		return found;
	}

	/* Function for inorder traversal */
	public void inorder() {
		inorder(root);
	}

	private void inorder(BinarySearchTreeNode r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}

	/* Function for preorder traversal */
	public void preorder() {
		preorder(root);
	}

	private void preorder(BinarySearchTreeNode r) {
		if (r != null) {
			System.out.print(r.getData() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}

	/* Function for postorder traversal */
	public void postorder() {
		postorder(root);
	}

	private void postorder(BinarySearchTreeNode r) {
		if (r != null) {
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData() + " ");
		}
	}
}
