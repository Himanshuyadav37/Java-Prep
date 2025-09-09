import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashSet< Integer> set = new HashSet<>();
        // insertion  - O(1)         Hashmap are unordered
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(4);

      System.out.print(set);
      System.out.println();


      LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(5);
        lhs.add(4);
        System.out.print(lhs);



        // same operation work on linked hashmap also
    }
}
