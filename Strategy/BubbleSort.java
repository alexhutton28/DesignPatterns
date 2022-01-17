import java.util.ArrayList;

// Bubble Sort Developed by Alex Hutton for CSCE145 and redone for this project.
public class BubbleSort implements SortBehavior {
    /**
     * Sorts the given Array list with Bubble Sort
     * 
     * @param data the Array list that will be sorted
     * @return the sorted Array list
     */
    public ArrayList<String> sort(ArrayList<String> data) {
        boolean hasSwapped = true;
        int length = data.size();

        while (hasSwapped) {
            hasSwapped = false;
            for (int i = 0; i < length - 1; i++) {
                if (data.get(i).compareTo(data.get(i + 1)) > 0) {
                    // Swap
                    String temp = data.get(i);
                    data.set(i, data.get(i + 1));
                    data.set(i + 1, temp);
                    hasSwapped = true;
                }
            }
        }
        return data;
    }
}
