import java.util.Scanner;

public class Forbasics {
    public static void main(String[] args) {
        Scanner vic =new Scanner(System.in);
        System.out.println("enter a number ");
        int nums=vic.nextInt();
        int k=1;
        int fact=1;
        while(k<=nums){
            fact=fact*k;
                    k++;
        }
        System.out.println("the factorial of given number is "+fact);
    }
}
