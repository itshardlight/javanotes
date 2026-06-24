class Test{
       int addition(int a,int b){
        return a+b;
    }
        int addition(int a,int b,int c){
        return a+b;
    }
        Double addition(Double a,Double b){
        return a+b;
    }
}  

public class Overloading {
    public static void main(String[] args) {
        Test cal = new Test();
        System.out.println(cal.addition(1,2));
        System.out.println(cal.addition(1,2,4));
        System.out.println(cal.addition(1.3,2.3));

    }
}
/*
Java over loading 
--> type 
--> no of parameters
static and non static method 
--> nonstatic is creating in seprate class 
--> static is using the static inside of the same class but out side of the main method
*/