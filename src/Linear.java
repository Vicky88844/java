public class Linear {
    public static void main(String[] args) {
        int[] array = {7, 8, 9, 4, 5, 6, 1, 2, 3};
        int index = LinearSearch(array, 5);
        if (index !=-1){
            System.out.println("Index of the array is at :"+index);
        }
        else {
            System.out.println("index of the array is not founded");
        }
    }

    private static int LinearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }

        }
        return -1;
    }

}
