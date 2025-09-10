class TrieNode {
    TrieNode[] children = new TrieNode[26]; // for lowercase a-z
    boolean isEndOfWord;

    TrieNode() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert word into Trie
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a'; // find position (0-25)
            if (node.children[index] == null) {
                node.children[index] = new TrieNode(); // create new node if not exist
            }
            node = node.children[index]; // move to next
        }
        node.isEndOfWord = true; // mark end of word
    }

    // Search word in Trie
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.children[index] == null) {
                return false; // not found
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }
}

public class Main{
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("cat");
        trie.insert("car");
        trie.insert("dog");

        System.out.println(trie.search("cat")); // true
        System.out.println(trie.search("cap")); // false
    }
}
