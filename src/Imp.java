public class Imp {
    public static void main(String[] args) {
        int[] us =new int[]{-59,1,65,6,4,-88,66,3,22};
        System.out.println("Arrays after implemented in sorting method");
        for (int i = 0; i < us.length; i++) {
            for (int j = 0; j < us.length ; j++) {
                int temp=0;
                if (us[i]>us[j]){

                    temp=us[i];
                 us[i]=us[j];
                   us [j]=temp;
                    System.out.println(us[i]);
                }
            }
        }
    }
}
