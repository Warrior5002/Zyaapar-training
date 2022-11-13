
import java.util.Scanner;

public class Types {
Ingredients ing=new Ingredients();
    public void classic(){
        System.out.println("We Have 2 Catagories In Classic");
        System.out.println("1.Tomchi\n"+"2.Caponito\n");

        Scanner sc5 = new Scanner(System.in);
        int choice3 = sc5.nextInt();

        if(choice3 == 1) {
            ing.tomchi();
        }
        else if(choice3 == 2) {
            ing.caponito();
        }

    }
    public void Premium(){
        System.out.println("We Have 2 Catagories In Premium");
        System.out.println("1.Red Indian\n"+"2.Party lovers\n");

        Scanner sc6 = new Scanner(System.in);
        int choice3 = sc6.nextInt();

        if(choice3 == 1) {
            ing.RedIndian();
        }
        else if(choice3 == 2) {
            ing.partyLovers();
        }


    }
    public void supreme(){
        System.out.println("We Have 2 Categories In Supreme");
        System.out.println("1.American Heat\n"+"2.Re-Union\n");

        Scanner sc6 = new Scanner(System.in);
        int choice3 = sc6.nextInt();

        if(choice3 == 1) {
            ing.americanHeat();
        }
        else if(choice3 == 2) {
            ing.reUnion();
        }


    }
}


