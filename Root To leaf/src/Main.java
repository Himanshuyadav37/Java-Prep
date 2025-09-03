import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

class BST {
    Node root;

    // Insert into BST
    Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Print one path
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("N");
    }

    // Recursive function to print all root-to-leaf paths
    public static void pathToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        // add current node
        path.add(root.data);

        // if leaf node -> print path
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            // recurse for children
            pathToLeaf(root.left, path);
            pathToLeaf(root.right, path);
        }

        // backtrack
        path.remove(path.size() - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        Node root = null;
        root = tree.insert(root, 50);
        tree.insert(root, 30);
        tree.insert(root, 70);
        tree.insert(root, 20);
        tree.insert(root, 40);
        tree.insert(root, 60);
        tree.insert(root, 80);

        System.out.println("All Root to Leaf Paths:");
        BST.pathToLeaf(root, new ArrayList<>());
    }
}
