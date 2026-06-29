import java.util.Vector;

public class Vectorinclass {
    public static void main(String[] args) {
        Vector<Integer> test = new Vector<>(3, 2);
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(3);

        System.out.println(test.size());
        System.out.println(test.capacity());

    }
}
