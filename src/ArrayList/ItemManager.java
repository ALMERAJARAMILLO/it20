package ArrayList;

import java.util.ArrayList;

public class ItemManager {

    private ArrayList<String> items;

    //Constructor to initialize the Arraylist
    public ItemManager() {
        items = new ArrayList<>();
    }
    
    //method to display items
    public void displayItems() {
        System.out.println("Items in the list: " + items);
    }

}
