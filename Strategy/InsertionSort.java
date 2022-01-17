import java.util.ArrayList;

// Developed from code from "Insertion Sort" -Geeks for Geeks
public class InsertionSort implements SortBehavior {
    /**
     * Sorts the given Array List with Inserstion Sort
     * 
     * @param data the Array List that will be sorted
     * @return the sorted Array List
     */
    public ArrayList<String> sort(ArrayList<String> data) {
        {
            int length = data.size();
            for (int i = 1; i < length; ++i) {
                String key = data.get(i);
                int j = i - 1;

                while (j >= 0 && data.get(j).compareTo(key) > 0) {
                    data.set(j + 1, data.get(j));
                    j = j - 1;
                }
                data.set(j + 1, key);
            }
        }
        return data;
    }
}
