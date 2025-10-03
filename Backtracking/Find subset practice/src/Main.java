public class Main {

    public static void findSubset(String str, String ans, int idx) {
        // base case
        if (idx == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null"); // empty subset
            } else {
                System.out.println(ans);
            }
            return; // stop further recursion
        }

        // choice → include character
        findSubset(str, ans + str.charAt(idx), idx + 1);

        // choice → exclude character
        findSubset(str, ans, idx + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0); // pass empty string instead of " "
    }
}
