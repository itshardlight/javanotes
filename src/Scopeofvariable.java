public class Scopeofvariable {
    static int y =3; //global variable
    public static void main(String[] args) {
        int x = 1; //local scope variable
        System.out.println(x);
        System.out.println(y);
        something();
    }
    static void something(){
        int x = 2; // can be used here cause it is created inside of a dif method
        System.out.println(x);
        System.out.println(y);
    }
}
