import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("please enter the first number: ");
        int a =in.nextInt();
        Scanner ou = new Scanner(System.in);
        System.out.print("please enter the second number: ");
        int b =ou.nextInt();
        if (a == b){
            System.out.println("Both of the numbers are same. Try using different numbers");
            return;
        }

      int temp =a;
        a=b;
        b=temp;
        System.out.println(a +" "+b);
    }
}
