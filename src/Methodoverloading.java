public class Methodoverloading {
    //make sure to use a dif parameter but the method name can be same as given
    static int add(int a, int b){
        return(a+b);
    }
    static int add(int a, int b,int c){
        return(a+b+c);
    }
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(3,4,5));
    }
}
