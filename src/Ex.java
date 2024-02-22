import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.print("enter a number :");
            int x = scanner.nextInt();
            System.out.print("enter the second number");
            int y = scanner.nextInt();
            int z = x + y;
            System.out.println(z);
        }
        catch (Exception e){
            System.out.println("OOPS try again");
        }
        finally {
            System.out.println("TRY AGAIN");
        }
    }
}
