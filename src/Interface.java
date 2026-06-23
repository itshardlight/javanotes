/*
class Parent{
    void display(){
        System.out.println("this is display");
    }
}
class Child extends Parent{
    int age=12;
    void check(){
        System.out.println("this is check");
    }
}
public class Rough{
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
*/

interface Parent{
    void display();
}
class Child implements Parent{
    void check(){
        System.out.println("this is check");
    }
    public void display(){
        System.out.println("this is parent");
    }
}

public class Interface{
    public static void main(String[] args) {
        Child child = new Child();
        child.check();
        child.display();
    }
}
/*
-->Interface is the blueprint of an object 
-->Properties of Interface must be implemented else throws error 
-->It is extended in other classes using implements 
-->It makes like rules that must be implemented by subclass inorder to run the code
*/