public class BinarySearch {
    // Efficiency: O(log n)
    public static int search(int[] array, int alvo) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (array[middle] == alvo) {
                return middle;
            }
            if (array[middle] > alvo) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}