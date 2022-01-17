import java.util.ArrayList;

/**
 * A Class that provides extra tools for an Array list and allows for easy
 * sorting
 * 
 * @Author Alex Hutton
 * 
 */
public class Listing {
    /**
     * Creates a new listing with the indicated name and the bubble sorting method
     * 
     * @param title        the title of the Array List
     * @param list         the name of the Array List
     * @param sortBehavior the method that will be used to sort the array list
     */
    private String title;
    private ArrayList<String> list;
    SortBehavior sortBehavior = new BubbleSort();

    /**
     * Creates a Listing with set title
     * 
     * @param title the title of the Array List
     */
    public Listing(String title) {
        this.title = title;
        this.list = new ArrayList<String>();
    }

    /**
     * Adds defined String "item" to ArrayList
     * 
     * @param item the String that will be added to the Array List
     */
    public void add(String item) {
        list.add(item);
    }

    /**
     * Removes defined String "item from Array List"
     * 
     * @param item tge String that will be removed from the Array List
     */
    public void remove(String item) {
        list.remove(item);
    }

    /**
     * Gets the title of the list
     * 
     * @return the title of the list
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the sort behavior
     * 
     * @param sortBehavior The type of sorting that will be used
     */
    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    /**
     * Sorts the list using the set sorting method
     * 
     * @return a sorted version of the list
     */
    public ArrayList<String> getSortedList() {
        return sortBehavior.sort(this.list);
    }

    /**
     * Returns the unsorted ArrayList
     * 
     * @return the default unsorted ArrayList
     */
    public ArrayList<String> getUnsortedList() {
        return list;
    }

}
