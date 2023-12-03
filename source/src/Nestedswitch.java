import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int names= in.nextInt();
       String roles=in.next();

        switch (names) {
            case 1:
                System.out.println("vicky");
                break;
            case 2:
                System.out.println("suray");
                break;
            case 3:
                System.out.println("niqqa");
                break;
            case 4:
                switch (roles){
                    case  "Software Engineer":
                        System.out.println("Software Engineer department");
                        break;
                    case "Software Developer":
                        System.out.println("Software Developer department");
                        break;
                    case "Analyst":
                        System.out.println("analyst department");
                        break;
                    default:
                        System.out.println("give a role ");
                }
            default:
                System.out.println("give a name ");

        }
    }
}
