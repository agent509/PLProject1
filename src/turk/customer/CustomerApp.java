package turk.customer;

import java.util.Scanner;

public class CustomerApp {

  public static void main(String args[]) {
    String response = "y";
    
    System.out.println("Welcome to the Customer Viewer");

    while(response.equals("y")){

      Scanner input = new Scanner(System.in);
      System.out.print("\nEnter a customer number: ");
      int custNum = input.nextInt();


      Customer cust = CustomerDB.getCustomer(custNum);

      if(cust == null){
        System.out.println("\nThere is no customer " + custNum + " in our records.\n");
      }
      else{
      System.out.println("\n" + cust.getNameAndAddress()+ "\n");
      }
      Scanner input2 = new Scanner(System.in);
      System.out.print("Disaplay Another Customer? (y/n): ");
      response = input.next();

    }
  }

}
