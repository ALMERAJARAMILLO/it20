package topic_2_linkedlist_string;

import java.util.Scanner;

public class main {

    public static Linkedlist list = new Linkedlist();
    public static Scanner in = new Scanner(System.in);

    public static void adding() {
        boolean repeat = true;

        while (repeat) {
            System.out.println("Would you like to add elements?");
            System.out.print("Element:");
            String element = in.next();
            list.add(element);
            System.out.println("Element " + element + " ' Successfully added");
            System.out.println("Would you like to add another one?" + "\nPress 1 for Yes \n Press 2 for No");
            int resp = in.nextInt();

            if (resp == 1) {
                repeat = true;
            } else if (resp == 2) {
                repeat = false;
            } else {
                System.out.println("Invalid Input. Please only enter 1 or 2");
                in.close();
                break;
            }
        }
    }
     public static void delete() {
        System.out.println("Enter element you want to delete");
        list.printlist();
        String element = in.next();
        list.deleteByValue(element);
        System.out.println("Element ' " + element + " ' Successfully deleted!");
        System.out.print("list: ");
    }

    public static void main(String[] args) {

        System.out.println("You're here in the Simple LinkedList Program");
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Add Element");
            System.out.println("2. Move or switch Element");
            System.out.println("3. Exit");
            System.out.println("--------------------------------");
            System.out.println();

            try {
                System.out.println("Response: ");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        adding();
                        break;
                    case 2:
                        delete();
                        break;
                    case 3:
                        exit = true;
                        System.out.println("Thank You for Visiting");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid one");
                }
            } catch (Exception h) {
                System.out.println("Error 404:");
                break;
            }
        }
    }
}
