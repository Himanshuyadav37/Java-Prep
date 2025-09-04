class HeapSort {

    // Main heapsort: builds a max-heap, then repeatedly moves max to the end
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 1) Build max-heap (heapify all non-leaf nodes)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 2) Extract elements one by one from the heap
        for (int end = n - 1; end > 0; end--) {
            // Move current root (max) to the end
            swap(arr, 0, end);
            // call heapify on the reduced heap
            heapify(arr, end, 0);
        }
    }

    // Heapify subtree rooted at index i, with heap size n
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;        // assume root is largest
        int left = 2 * i + 1;   // left child
        int right = 2 * i + 2;  // right child

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If root isn't largest, swap and continue heapifying
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    // Quick demo
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        heapSort(arr);
        // Print sorted array
        for (int x : arr) System.out.print(x + " ");
        // Output: 5 6 7 11 12 13
    }
}
