class Parent{
    int age=52;
    void showNormal(int age){
        int test = age;
        System.out.println("this is normal age "+test);
    }
    void show(int age){
        this.age=age;
        System.out.println("this is this age "+this.age);
    }
}
public class This {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Parent();
        p1.showNormal(12);
        p1.show(12);
        p2.showNormal(22);
        p2.show(22);
    }
}


/*
This->instance(object) variable->method->constructors
this saves the value in the object 
*/