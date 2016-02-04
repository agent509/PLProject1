package turk.customer;


import java.util.Scanner;

public class CustomerApp {

  public static void main(String args[]) {
    String response = "y";
    
    while(response == "y"){

      System.out.println("Welcome to the Customer Viewer\n");
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a customer number: ");
      int custNum = input.nextInt();


      Customer customer = getCustomer(custNum);

      if(customer.getName() == "error"){
        System.out.println("There is no customer " + custNum + " in our records.");
      }

      System.out.println(customer.getNameAndAddress()+ "\n");

      Scanner input2 = new Scanner(System.in);
      System.out.print("Disaplay Another Customer? (y/n): ");
      response = input.next();

    }
  }

}
