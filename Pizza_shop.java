 import java.util.Scanner;


    public class Pizza_shop {

        public static void main(String[] args) {


            //link to next class

            Categories pizzi=new Categories();



            System.out.println("Welcome to Pizza Shop");
            System.out.println("Select Cuisine");
            System.out.println(" 1.Regular");
            System.out.println(" 2.Jain");
            System.out.println(" 3.Non-Veg");


            Scanner sc= new Scanner(System.in);
            int choice = sc.nextInt();

            if(choice == 1) {
                pizzi.regularpizza();
            }
            else if(choice == 2) {
                pizzi.jain();
            }
            else if(choice == 3) {
                pizzi.nonveg();
            }




        }
}
