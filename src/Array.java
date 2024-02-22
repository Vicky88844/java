import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        ArrayList<String>vi=new ArrayList<String>();
        vi.add("nnn");
        vi.add("iii");
        vi.add("ggg");
        vi.add("ggg");
        vi.add("aaa");
        for (int i = 0; i < vi.size() ; i++) {
            System.out.println(vi.get(i));
        }

    }
}