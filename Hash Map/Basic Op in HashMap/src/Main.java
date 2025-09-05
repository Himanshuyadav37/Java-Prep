import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        // create
        HashMap<String, Integer> map = new HashMap<>();

        // insertion  - O(1)         Hashmap are unordered
        map.put("India",1);
        map.put("China",2);
        map.put("Russia",3);

        // print
        System.out.println("Insertion in Hashmap : " + map);
        System.out.println("------------------------------------------------------------");


        // get  - O(1)
        int Ranking = map.get("India");
        System.out.println("Get in Hashmap : " + Ranking);
        System.out.println("-----------------------------------------------------------");


        //containsKey  - O(1)
        System.out.print("ContainsKey in Hashmap : " + map.containsKey("India") + "        ");     // true
        System.out.println("ContainsKey in Hashmap : " + map.containsKey("America"));   // False
        System.out.println("-----------------------------------------------------------");


        //remove - O(1)
        System.out.println("Remove in HashMap :  "  + map.remove("China"));
        System.out.println("After removing China " + map);
        System.out.println("-----------------------------------------------------------");


        // size
        System.out.println("Size of Hashmap : " + map.size());
        System.out.println("-----------------------------------------------------------");


        // Is Empty
        System.out.println("Is Empty : " + map.isEmpty());


        // clear
        map.clear();
    }
}