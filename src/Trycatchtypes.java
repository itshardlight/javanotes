public class Trycatchtypes {
    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        String string = null;
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        } catch (Exception e) {
            System.out.println("Nomal parent error class");
        }
        try {
            System.out.println(string.length());
        } catch (NullPointerException | ArithmeticException f) {
            System.out.println("error is " + f);

        }
    }
}
/*
 * Multiple catch block | Multiple Exception
 * --> Multiple catch blocks do NOT mean multiple errors will be handled at once
 * --> Only ONE exception occurs at a time
 * --> Java checks catch blocks from top to bottom
 * --> The FIRST matching catch block will run
 */