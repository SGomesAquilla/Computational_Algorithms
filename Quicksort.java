public class Quicksort {
    // Efficiency: O(n log n)
    public static void sort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partitionate(array, start, end);
            sort(array, start, pivotIndex - 1);
            sort(array, pivotIndex + 1, end);
        }
    }

    private static int partitionate(int[] array, int start, int end) {
        int pivot = array[end];
        int i = (start - 1);

        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        return i + 1;
    }
}