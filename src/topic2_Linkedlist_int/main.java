package topic2_Linkedlist_int;

import java.util.Scanner;

public class main {

    public static Linkedlist list = new Linkedlist();
    public static Scanner sc = new Scanner(System.in);

    //This is a block of methods
    public static void adding() {
        boolean repeat = true;

        while (repeat) {
            System.out.println("What Integer would you like to add?");
            System.out.print("Integer: ");
            int elemt = sc.nextInt();
            list.add(elemt);
            System.out.println("Integer ' " + elemt + " ' added successfully");
            System.out.println("Would you like to add more?" + "\nPress 1 for YES \nPress 2 for NO");
            int resp = sc.nextInt();

            if (resp == 1) {
                repeat = true;
            } else if (resp == 2) {
                repeat = false;
            } else {
                System.out.println("Invalid input. Please enter 1 or 2.");
                sc.close();
                break;
            }

        }

    }

    public static void move() {
        System.out.println("Enter the first index you want to swap: ");
        int element1 = sc.nextInt();
        System.out.println("Enter the second index you want to swap: ");
        int element2 = sc.nextInt();

        list.moveNodePointer(element1, element2);
        list.printList();
    }

    public static void display() {
        list.printList();
    }

    public static void delete() {
        System.out.println("What Integer would you like to delete from this list?");
        list.printList();
        int element = sc.nextInt();
        list.deleteByValue(element);
        System.out.println("Integer '" + element + "' successfully deleted!");
        System.out.print("List: ");
        list.printList();
    }

    public static void main(String[] args) {

        //Displaying Menu Choices
        System.out.println("Welcome to Simple LinkedList Program!");
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("-----------------------");
            System.out.println("1. Add Integer");
            System.out.println("2. Move or Swap Integer");
            System.out.println("3. Display");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("-----------------------");
            System.out.println();

            try {
                System.out.print("Response: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        adding();
                        break;
                    case 2:
                        move();
                        break;
                    case 3:
                        display();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        exit = true;
                        System.out.println("Thank you for using Simple Linkedlist Program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } catch (Exception e) {
                System.out.println("Error 404. Input Invalid");
                break;
            }

        }
    }
}
