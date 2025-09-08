
import java.util.HashMap;
import java.util.Set;

public class Main {
            public static void main(String[] args) {

                // create
                HashMap<String, Integer> map = new HashMap<>();

                // insertion  - O(1)         Hashmap are unordered
                map.put("India", 1);
                map.put("China", 2);
                map.put("Russia", 3);
                map.put("America", 4);
                map.put("Australia", 5);
                map.put("Canada", 6);


                // Iteration
                    // here we use keyset but we can also uise entrySet()
                Set<String> keys = map.keySet();
//                System.out.print(keys);

                for (String k : keys){
                    System.out.println("Key : " + k + " ,  Value : " + map.get(map));
                }
            }

        }

