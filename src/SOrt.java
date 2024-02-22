import java.util.Arrays;
public class SOrt {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 9, 4, 5, 6, 3};
        Arrays.sort (arr);
        System.out.println("arrays after implemented");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
