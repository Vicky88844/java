import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();
        if (i %2==0){
            System.out.println("EVEN");
        }
        else
        System.out.println("ODD");
    }
}