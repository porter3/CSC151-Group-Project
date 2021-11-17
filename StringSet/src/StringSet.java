/**
 * Creates a container for strings
 * 
 * @author Jacob Porter
 * Course: CSC151.0002
 */
import java.util.ArrayList;

public class StringSet extends ArrayList<String> {

	/**
	 * Adds a new string to the list. Returns false if string could not be added
	 */
    public boolean add(String newStr) {
        try {
            super.add(newStr);
        } catch (RuntimeException e) {
            return false;
        }
        return true;
    }

    /**
     * Removes the most recently added string from the list
     */
    public void pop() {
        if (size() > 0) {
            remove(size() - 1);
        }
    }

    /**
     * Returns a sum of all numerical strings in the list
     */
    public int sumValidIntegers() {
        int total = 0;
        int num;
        for (int i = 0; i < size(); i++) {
            try {
                num = Integer.parseInt(get(i));
                total += num;
            } catch (NumberFormatException e) {
                // do nothing
            }
        }
        return total;
    }

    /**
     * Returns the total number of characters in the list
     */
    public int numChars() {
        int total = 0;
        for (int i = 0; i < size(); i++) {
            total += get(i).length();
        }
        return total;
    }

    /**
     * Counts the amount of times a given substring appears in the list
     */
    public int countStrings(String stringToLookFor) {
        int total = 0;
        for (int i = 0; i < size(); i++) {
            if (get(i).contains(stringToLookFor)) {
                total++;
            }
        }
        return total;
    }
}
