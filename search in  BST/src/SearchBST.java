
//    // Search in BST
//    boolean search(Node root, int key) {
//        if (root == null) {
//            return false; // key not found
//        }
//        if (root.data == key) {
//            return true;  // key found
//        }
//        if (key < root.data) {
//            return search(root.left, key); // search left
//        } else {
//            return search(root.right, key); // search right
//        }
//    }
//}
//



class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
Node root;

        Node insert(Node root, int value){
            if(root == null){
                root = new Node(value);
                return root;
            }
            if(value < root.data){
                root.left = insert(root.left,value);
            }
            if(value > root.data){
                root.right = insert(root.right,value);
            }
            return root;
}
    // Search in BST
    boolean search(Node root, int key) {
        if (root == null) {
            return false; // key not found
        }
        if (root.data == key) {
            return true;  // key found
        }
        if (key < root.data) {
            return search(root.left, key); // search left
        } else {
            return search(root.right, key); // search right
        }
    }
}







        public class SearchBST {
    public static void main(String[] args) {
        BST tree = new BST();

        // Create BST
        Node root = null;
        root = tree.insert(root, 50);
        tree.insert(root, 30);
        tree.insert(root, 70);
        tree.insert(root, 20);
        tree.insert(root, 40);
        tree.insert(root, 60);
        tree.insert(root, 80);

        // Search keys
        int key1 = 40;
        int key2 = 90;

        System.out.println("Searching for " + key1 + ": " + tree.search(root, key1));
        System.out.println("Searching for " + key2 + ": " + tree.search(root, key2));
    }
}