
import java.util.Scanner;

public class Ingredients extends size {

    order order = new order();

    public void tomchi() {
        size size = new size();
        String a =size.sizee;
        System.out.println("Ingredients of tomchi\n"+"1.Tomato\n"+"2.Onion\n"+"3.Chilly & Cheese\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of Ingredients you want: ");
        String[] string = new String [sc.nextInt()];

        sc.nextLine();
        for (int i = 0; i < string.length; i++)
        {
            string[i] = sc.nextLine();
        }


        size.classicsize();
        System.out.print("you have selected Classic Tomchi" +" "+ sizee +" With Ingredients ");
        for(String str: string)
        {
            System.out.print(str+" ");
        }
        System.out.print("Worth Rs "+ amount);
        order.orderpizza();
    }
    public void caponito() {
        size size = new size();
        String a =size.sizee;
        System.out.println("Select the Ingredients \n"+"1.Capsicum\n"+"2.Onion\n"+"3.Tomato & Cheese\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of Ingredients you want: ");
        String[] string = new String [sc.nextInt()];

        sc.nextLine();
        for (int i = 0; i < string.length; i++)
        {
            string[i] = sc.nextLine();
        }
        size.classicsize();

        System.out.print("you have selected Classic Caponito" +" "+ sizee +" With Ingredients ");
        for(String str: string)
        {
            System.out.print(str+" ");
        }
        System.out.print("Worth Rs "+ amount);
        order.orderpizza();
    }
    public void RedIndian() {
        size size = new size();
        String a =size.sizee;
        System.out.println(" Ingredients in RedIndian");
        System.out.println("1.Cheese\n"+"2.Paneer\n"+"3.Chilly\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of Ingredients you want: ");
        String[] string = new String [sc.nextInt()];

        sc.nextLine();
        for (int i = 0; i < string.length; i++)
        {
            string[i] = sc.nextLine();
        }
        size.PremiumSize();

        System.out.print("you have selected Premium Red Indian" +" "+ sizee +" With Ingredients ");
        for(String str: string)
        {
            System.out.print(str+" ");
        }
        System.out.print("Worth Rs "+ amount);
        order.orderpizza();

    }
    public void partyLovers() {
        size size = new size();
        String a =size.sizee;
        System.out.println("Ingredients of partyLovers pizza");
        System.out.println("1.Cheese\n"+"2.Sweetcorn\n"+"3.Capsicum\n"+"4.Tomato\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of Ingredients you want: ");
        String[] string = new String [sc.nextInt()];

        sc.nextLine();
        for (int i = 0; i < string.length; i++)
        {
            string[i] = sc.nextLine();
        }
        size.PremiumSize();

        System.out.print("you have selected Premium Party Lovers" +" "+ sizee +" With Ingredients ");
        for(String str: string)
        {
            System.out.print(str+" ");
        }
        System.out.print("Worth Rs "+ amount);
        order.orderpizza();
    }
    public void americanHeat() {
        size size = new size();
        String a =size.sizee;
        System.out.println("Ingredients in americanHeat");
        System.out.println("1.Cheese\n"+"2.Capsicum\n"+"3.Baby Corn\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of Ingredients you want: ");
        String[] string = new String [sc.nextInt()];

        sc.nextLine();
        for (int i = 0; i < string.length; i++)
        {
            string[i] = sc.nextLine();
        }

        size.supremeSize();

        System.out.print("you have selected Supreme American Heat" +" "+ sizee +" With Ingredients ");
        for(String str: string)
        {
            System.out.print(str+" ");
        }
        System.out.print("Worth Rs"+ amount);
        order.orderpizza();
    }
    public void reUnion() {
        size size = new size();
        String a =size.sizee;
        System.out.println("Ingredients you want in reUnion");
        System.out.println("1.Cheese\n"+"2.Spanish\n"+"3.Capsicum\n"+"4.Baby Corn\n"+"5.Olives\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of Ingredients you want: ");
        String[] string = new String [sc.nextInt()];

        sc.nextLine();
        for (int i = 0; i < string.length; i++)
        {
            string[i] = sc.nextLine();
        }
        size.supremeSize();

        System.out.print("you have selected Supreme Re-Union" +" "+ sizee +" With Ingredients ");
        for(String str: string)
        {
            System.out.print(str+" ");
        }
        System.out.print("Worth Rs "+ amount);
        order.orderpizza();
    }

}

