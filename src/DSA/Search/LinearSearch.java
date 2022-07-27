package DSA.Search;

public class LinearSearch {
    /**
     * Iterate through a collection one element at a time
     * Does not need collection to be sorted but is slow when data increases
     */

    public static void main(String[] args) {
        int array[] = { 10, 9, 2, 25, 3, 1, 7 };
        int target = 24;

        int index = linearSearch(array, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the given array");
        }
    }

    private static int linearSearch(int array[], int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
