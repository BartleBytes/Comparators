import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSortCorrections {
    /**
     * Sorts the given ArrayList using the selection sort algorithm.
     *
     * @param list       the ArrayList to be sorted
     * @param comparator the comparator to determine the order of elements
     * @param <T>        the type of elements in the ArrayList
     */
    public static <T> void selectionSort(ArrayList<T> list, Comparator<? super T> comparator) {
        // Check if the list or comparator is null, or if the list is empty
        if (list == null || list.isEmpty() || comparator == null) {
            System.out.println("Cannot sort. List is null, empty, or comparator is null.");
            return;
        }

        int n = list.size();
        // Iterate through the list
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part of the list
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the first element of the unsorted part
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}
