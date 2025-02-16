import java.util.Scanner;

public class F {
    public static void main(String[] args) {
       Scanner nc = new Scanner(System.in);

        System.out.println("Enter your name" );
        String name= nc.nextLine();
        if(name.equalsIgnoreCase("Vicky")||
        name.equalsIgnoreCase("Brownie JR")||
        name.equalsIgnoreCase("Mintu")||
        name.equalsIgnoreCase("Brownie"))
            System.out.println("Welcome!");
    else {
            System.out.println("You're a poop particle");
        }

    }
}