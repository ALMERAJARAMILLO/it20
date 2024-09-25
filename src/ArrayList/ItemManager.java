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

    // Methods to add user's input to Arraylist   
    public void addItems(String item1, String item2, String item3) {
        items.add(item1);
        items.add(item2);
        items.add(item3);
        System.out.println("You added: " + items);
    }
    
}


