import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmapin {
    public static void main(String[] args) {
        int key = 1;
        HashMap<Integer, String> test = new HashMap<>();
        test.put(2, "Ram");
        test.put(3, "Unish");
        test.put(1, "Sita");
        // which takes the order ?
        System.out.println(test);
        LinkedHashMap<Integer, String> test2 = new LinkedHashMap<>();
        test2.put(2, "Ram");
        test2.put(1, "Unish");
        test2.put(3, "Sita");

        System.out.println(test2);
    }
}
