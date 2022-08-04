package BinarySearchTree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("Binary Search Tree Test\n");
		while (true) {
			System.out.println("\nBinary Search Tree Operations\n");
			System.out.println("1. Insert ");
			System.out.println("2. Count Nodes");
			System.out.println("\nEnter Your Options: \n");

			int choice = Utility.inputInteger();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				bst.insert(Utility.inputInteger());
				break;
			case 2:
				System.out.println("Nodes = " + bst.countNodes());
				break;

			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			/* Display tree */
			System.out.print("\nPost order : ");
			bst.postorder();
			System.out.print("\nPre order : ");
			bst.preorder();
			System.out.print("\nIn order : ");
			bst.inorder();

					}

	}

}
