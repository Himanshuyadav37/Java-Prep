class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

class BST {
    // Insert into BST (for testing)
    Node insert(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.data) root.left = insert(root.left, value);
        else if (value > root.data) root.right = insert(root.right, value);
        return root;
    }

    // Wrapper method
    public boolean isValidBST(Node root) {
        return isValidBST(root, null, null);
    }

    // Recursive method with range
    private boolean isValidBST(Node root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min) {
            return false;
        }
        if (max != null && root.data >= max) {
            return false;
        }

        return isValidBST(root.left, min, root.data) &&
                isValidBST(root.right, root.data, max);
    }
}

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        // Create a valid BST
        Node root = null;
        root = tree.insert(root, 50);
        tree.insert(root, 30);
        tree.insert(root, 70);
        tree.insert(root, 20);
        tree.insert(root, 40);
        tree.insert(root, 60);
        tree.insert(root, 80);

        // Check validity
        System.out.println("Is valid BST? " + tree.isValidBST(root));

        // Make it invalid manually
        root.left.right.right = new Node(55); // 55 is in wrong place
        System.out.println("Is valid BST? " + tree.isValidBST(root));
    }
}
