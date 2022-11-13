import java.util.Scanner;

public class order {

    public void orderpizza() {
        order or = new order();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter 1 to Order the pizza. \n Enter 0 to Cancel The Order.");

        int choice = sc.nextInt();
        if(choice==1) {
            System.out.println("Order placed Successfully.");
        }
        else if(choice == 0) {
            System.out.println("Order has not been placed.");

        }
        else {
            System.out.println("Please Enter Valid Input");
            or.orderpizza();
        }
    }

}


