import java.util.ArrayList;

public class Arraylistclass {
    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list);
        for (int a : list) {
            list.add(a);
        }

    }
}
