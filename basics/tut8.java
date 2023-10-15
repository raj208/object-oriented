import java.util.ArrayList;

public class tut8 {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Displaying the elements
        System.out.println("Fruits: FIRST ONE ");
        System.out.println("Fruits: " + fruits);

        // Adding another element
        fruits.add("Orange");

        // Displaying the updated elements
        System.out.println("Fruits (after adding Orange): " + fruits);

        // Removing an element by index
        fruits.remove(1);

        // Displaying the updated elements
        System.out.println("Fruits (after removing Banana): " + fruits);

        // Removing an element by value
        fruits.remove("Cherry");

        // Displaying the updated elements
        System.out.println("Fruits (after removing Cherry): " + fruits);
    }
}
