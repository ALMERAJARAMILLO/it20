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

    }
}
