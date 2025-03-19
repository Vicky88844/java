import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Vegetable name");
        String vegetables=in.next();

        switch (vegetables) {
            case"tomato":
                System.out.println("tomato is red");
                break;
            case "potato":
                System.out.println("potato is brown");
                break;
            case "carrot":
                System.out.println("carrot is orange");
                break;
            case "beetroot":
                System.out.println("beetroot is purple");
                break;
            default:
                System.out.println("Sorry for the inconvenience");
        }
    }
}
