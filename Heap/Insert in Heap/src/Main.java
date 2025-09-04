
import java.util.*;

public class Main {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Add element to Min Heap
        public void add(int data) {
            arr.add(data); // Step 1: always add at last index

            int child = arr.size() - 1; // child index
            int par = (child - 1) / 2;  // parent index

            // Step 2: Bubble up while heap property is violated
            while (child > 0 && arr.get(child) < arr.get(par)) {
                // Swap
                int temp = arr.get(child);
                arr.set(child, arr.get(par));
                arr.set(par, temp);

                // Move up
                child = par;
                par = (child - 1) / 2;
            }
        }

        // Print heap
        public void printHeap() {
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(5);
        heap.add(3);
        heap.add(8);
        heap.add(1);
        heap.add(4);

        System.out.println("Min Heap: ");
        heap.printHeap(); // Output will be a valid Min Heap
    }
}
