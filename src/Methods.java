class Parent{
    int test(int a){
        return a;
    }
}
class Child extends Parent{
    //overloading
    int test(int a,int b){
        return a+b;
    }
    //overriding
    @Override
    int test(int a){
        return a*2;
    }
}
public class Methods {
    //void means no return
    //this is a normal method were we can use it by calling its name in the main method
    static void print(){
            System.out.println("this method prints");
         }
    //here we are having parameters which is replaced by the argument that is passed when calling it
    static void happybirthday(String name){

        System.out.println("Happy birthday dear "+ name);
    }

    //age generator by dob method
    //we have to mention the type of the return if we are not using void
    static int age(int dob){
        return 2026-dob;
    }

    public static void main(String[] args) {
        //calling the first method
        print();
           
        //normal method plus sending the argument 
        happybirthday("Unish");

        System.out.println(age(2005));
        //using normal method
        Parent parent = new Parent();
        System.out.println(parent.test(23));
        Child child = new Child();
        // overloading the method 
        System.out.println(child.test(2,3));
        //overriding the method
        System.out.println(child.test(3));
    }
}


/*
method-->
overloading = redefining method with  same name dif parameter
overriding = redefining method with same name same parameter (use @Override)
finalise = garbage collector just before an object is destroyed
*/