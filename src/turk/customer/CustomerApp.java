package turk.customer;


import java.util.Scanner;

public class CustomerApp {

  public static void main(String args[]) {
    char response = 'y';
    
    while(response == 'y'){

    System.out.println("Welcome to the Customer Viewer\n");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a customer number: ");
    int custNum = input.nextint();

    Customer customer = getCustomer(custNum);

    print


    System.out.println(custNum);

    }
  }

}
