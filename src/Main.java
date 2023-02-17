//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        menu(customerList);
    }

    public static void menu(ArrayList<Customer> customerList) {
        Scanner scan = new Scanner(System.in);
        boolean boolStop = false;
        String customerName, dateOfBirth, previousState, violation;
        //main loop
        do {
            System.out.println("1. Take test for new license\n" +
                    "2. Renew existing license\n" +
                    "3. Move from out of state\n" +
                    "4. Answer citation/suspended license\n" +
                    "5. See current queue\n" +
                    "6. Quit");
            int intMenu = Integer.parseInt(scan.nextLine());
            switch (intMenu) {
                case 1:
                    System.out.println("What is your name?");
                    customerName = scan.nextLine();
                    System.out.println("What is your date of birth?");
                    dateOfBirth = scan.nextLine();
                    customerList.add(new NewTest(customerName, dateOfBirth));
                    break;
                case 2:
                    System.out.println("What is your name?");
                    customerName = scan.nextLine();
                    customerList.add(new Renew(customerName));
                    break;
                case 3:
                    System.out.println("What is your name?");
                    customerName = scan.nextLine();
                    System.out.println("What state did you move from?");
                    previousState = scan.nextLine();
                    customerList.add(new Move(customerName, previousState));
                    break;
                case 4:
                    System.out.println("What is your name?");
                    customerName = scan.nextLine();
                    System.out.println("What violation did you commit?");
                    violation = scan.nextLine();
                    customerList.add(new Suspended(customerName, violation));
                    break;
                case 5:
                    for (Customer customer : customerList) {
                        System.out.println(customer.getCustomerInfo());
                    }
                    break;
                case 6:
                    boolStop = true;
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
        } while (!boolStop);
    }
}
