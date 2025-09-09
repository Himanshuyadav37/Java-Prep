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

        // using iterator
        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.print( i.next()+ " ");
        }

        System.out.println();

       // using advance for loop
        for(Integer num : set){
            System.out.print(num+" ");
        }
    }
}
