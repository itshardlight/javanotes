class Parent{
        private int age=12;
        public int year=2002;
        protected int price = 12232;
        int length = 222;
        void display(){
            System.out.println("this is age: "+age);
        }
}
class Child extends Parent{
    void display(){
    // System.out.println("this is age: "+age); here we cannot access the private variable
    System.out.println("this is age: "+year);
    }
}
public class Accessmodifier{
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        // System.out.println(parent.age);
        System.out.println("this is year: "+parent.year);
        System.out.println("this is price: "+parent.price);
        System.out.println("this is length: "+parent.length);
    }
}
/*
Access Modifier
-->private only accessable inside of the same class
-->public accessable anywhere 
-->protected accessable from same packages and the sub class even in dif package
-->default anywhere inside same packages 
*/