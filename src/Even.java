import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter a number");
        int i =in.nextInt();
        if(i%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
    }

