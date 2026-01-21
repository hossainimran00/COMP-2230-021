import java.util.Random;

public class MinElementAlgorithms {

    // Iterative algorithm to find the smallest element in an array
    // Time: O(n), Space: O(1)
    public static int findMinIterative(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Recursive algorithm to find the smallest element in an array
    // Time: O(n), Space: O(n) due to recursion stack
    public static int findMinRecursive(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        }
        int mid = (start + end) / 2;
        int leftMin = findMinRecursive(arr, start, mid);
        int rightMin = findMinRecursive(arr, mid + 1, end);
        return Math.min(leftMin, rightMin);
    }

    // Wrapper for recursive method
    public static int findMinRecursive(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        return findMinRecursive(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int n = 1000000; // Large array size for measurement
        int[] arr = new int[n];
        Random rand = new Random();

        // Fill array with random integers
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1000000);
        }

        // Measure iterative algorithm
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest garbage collection
        long startMem = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();
        int minIterative = findMinIterative(arr);
        long endTime = System.nanoTime();
        long endMem = runtime.totalMemory() - runtime.freeMemory();
        long timeIterative = endTime - startTime;
        long spaceIterative = endMem - startMem;

        System.out.println("Iterative Algorithm:");
        System.out.println("Min value: " + minIterative);
        System.out.println("Time taken: " + timeIterative + " nanoseconds");
        System.out.println("Space used (approx): " + spaceIterative + " bytes");
        System.out.println("Big O Time: O(n)");
        System.out.println("Big O Space: O(1)");
        System.out.println();

        // Measure recursive algorithm
        runtime.gc();
        startMem = runtime.totalMemory() - runtime.freeMemory();
        startTime = System.nanoTime();
        int minRecursive = findMinRecursive(arr);
        endTime = System.nanoTime();
        endMem = runtime.totalMemory() - runtime.freeMemory();
        long timeRecursive = endTime - startTime;
        long spaceRecursive = endMem - startMem;

        System.out.println("Recursive Algorithm:");
        System.out.println("Min value: " + minRecursive);
        System.out.println("Time taken: " + timeRecursive + " nanoseconds");
        System.out.println("Space used (approx): " + spaceRecursive + " bytes");
        System.out.println("Big O Time: O(n)");
        System.out.println("Big O Space: O(n)");
    }
}