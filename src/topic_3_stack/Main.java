package topic_3_stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack stck = new Stack(5);

        while (true) {
            System.out.println("Choose what you want to do: "
                    + " \n1. Size"
                    + " \n2. Push"
                    + " \n3. Peek"
                    + " \n4. Pop"
                    + " \n5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Stack size is: " + stck.size());
                    System.out.println("---------------------");
                    break;
                case 2:
                    System.out.println("Push Element: ");
                    int num = sc.nextInt();
                    stck.push(num);
                    System.out.println("---------------------");
                    break;
                case 3:
                    System.out.println("The top Element is: " + stck.peek());
                    break;
                case 4:
                    System.out.println("Popped element: " + stck.pop());
                    stck.size();
                    break;
                case 5:
                    System.out.println("Thank you for running the program!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }

}
