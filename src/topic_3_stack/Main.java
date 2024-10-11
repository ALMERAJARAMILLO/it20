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

        }
    }

}
