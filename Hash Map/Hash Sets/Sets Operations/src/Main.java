import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashSet< Integer> set = new HashSet<>();
        // insertion  - O(1)         Hashmap are unordered
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(1);

        // print
        System.out.println("Insertion in Hashset : " + set);
        System.out.println("------------------------------------------------------------");


//        // get  - O(1)
        if(set.contains(8)){
            System.out.println("Set contains");
        }else{
            System.out.println("Set not contains");
        }
        System.out.println("--------------------------------------------------------------");


//        //remove - O(1)
        System.out.println("Remove in HashMap :  "  + set.remove(1));
        System.out.println("After removing China " + set);
        System.out.println("-----------------------------------------------------------");


//        // size
        System.out.println("Size of Hashmap : " + set.size());
        System.out.println("-----------------------------------------------------------");


//        // Is Empty
        System.out.println("Is Empty : " + set.isEmpty());


//        // clear
        set.clear();
    }
}
