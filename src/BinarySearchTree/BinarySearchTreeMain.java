package BinarySearchTree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("Binary Search Tree Test\n");
		while (true) {
			System.out.println("\nBinary Search Tree Operations\n");
			System.out.println("1. insert ");
			System.out.println("Enter Your Option:");


			int choice = Utility.inputInteger();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				bst.insert(Utility.inputInteger());
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

			System.out.println("\nEnter Your Options: \n");
		}

	}

}
