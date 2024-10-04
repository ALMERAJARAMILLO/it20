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
    // Method to update the one item in the item list
    public void updateItem(int index, String newitem) {
        if(index >= 0 && index < items.size()){
            String olditem = items.set(index, newitem);
            System.out.println("You updated: " + olditem + "to" + newitem);
        }else{
            System.out.println("Index out of bounds");
        }
    }
    
     // Method to find item in the list
     public int finditem(String finditem) {
        int index = items.indexOf(finditem);
        if (index != -1) {
            System.out.println("Found: " + finditem + " at index" + index);
        } else {
            System.out.println(finditem + "not found");
        }
        return index;
    }
     
     // Method to delete one item in the list
     public void deleteItem(int index) {
        if (index >= 0 && index < items.size()) {
            String removeditem = items.remove(index);
            System.out.println("You have successfully deleted the item: " + removeditem);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}


