package ArrayList;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        ItemManager list = new ItemManager();
        //Initializing variables
        String item1, item2, item3, newitem, finditem;
        int index;
        
        //to display items first
        list.displayItems();
        
         // user input
        System.out.println("Enter 3 items you want to add: ");
        item1 = a.nextLine();
        item2 = a.nextLine();
        item3 = a.nextLine();
        
        //inputs that will be added to the arraylist
        list.addItems(item1, item2, item3);
        System.out.println(" ------------------------------");
        
        //Updating one value
        System.out.print("Enter an index number that you want to change: ");
        index = a.nextInt();
        a.nextLine();
        System.out.println("Enter a new item that you want to replace with the other index");
        newitem = a.nextLine();
        list.updateItem(index, newitem);
        list.displayItems();
        System.out.println("------------------------------------");
        
         //Finding user's input and displaying it
        System.out.println("Enter an item name that you want to find: ");
        finditem = a. nextLine();
        list.finditem(finditem);
        list.displayItems();
        System.out.print("-------------------------------------");
        
        

    }
}
