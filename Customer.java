import java.util.Scanner;

public class Customer {
    String cust_Name;  // Declare cust_Name
    long Account_no = 123456;
    Double Balance = 100000.00;

    void accept_details() {
        System.out.println("Enter your name and account number:");
        Scanner sc = new Scanner(System.in);
        cust_Name = sc.nextLine();  // Accept the name
        Account_no = sc.nextLong(); // Accept the account number
    }

    void Display_details() {
        System.out.println("Hello " + cust_Name);
        System.out.println("Your balance is " + Balance);
    }
}
