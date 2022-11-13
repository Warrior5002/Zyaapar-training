import java.util.Scanner;

public class Categories {

    Types typ=new Types();

        public void regularpizza() {
            System.out.println("We Have 3 Categories In Regular Pizza Please Choose Any One");
            System.out.println("1.Classic\n" + "2.Premium\n" + "3.Supreme\n");

            Scanner sc2 = new Scanner(System.in);
            int choice2 = sc2.nextInt();

            if(choice2 == 1) {

                typ.classic();

            }
            else if(choice2 == 2) {

                typ.Premium();
            }
            else if(choice2 == 3) {

                typ.supreme();
            }


        }

        public void jain(){
            System.out.println("We Have 2 Categories In Jain Pizza Please Choose Any One");
            System.out.println("1.Premium\n"+"2.Supreme\n");

            Scanner sc3 = new Scanner(System.in);
            int choice2 = sc3.nextInt();

            if(choice2 == 1) {
                typ.Premium();
            }
            else if(choice2 == 2) {
                typ.supreme();
            }


        }

        public void nonveg() {
            System.out.println("We Have 3 Categories In Regular Non-Veg Please Choose Any One");
            System.out.println("1.Classic\n"+"2.Premium\n"+"3.Supreme\n");

            Scanner sc4 = new Scanner(System.in);
            int choice2 = sc4.nextInt();

            if(choice2 == 1) {
                typ.classic();
            }
            else if(choice2 == 2) {
                typ.Premium();
            }
            else if(choice2 == 3) {
                typ.supreme();
            }


        }
    }





