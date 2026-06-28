import java.io.FileReader;

public class Exceptiontypes {
    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        try {
            FileReader file = new FileReader("file.txt");
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("This is Unchecked Exception");
        } catch (Exception e) {
            System.out.println("This is Checked Exception");
        }

    }
}
