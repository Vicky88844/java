import java.util.Scanner;

public class Boo {
    public static void main(String[] args){
//
        Scanner big =new Scanner(System.in);
        System.out.println("Enter a number to get a message");
        int i =big.nextInt();
        int j =big.nextInt();

        if(i<j) {
            System.out.println("HI MOM");
        } else{
            System.out.println("bye MOm");
        }
    }
}
