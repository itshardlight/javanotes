abstract class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
    void display(){
        System.out.println("this is parent");
    }
}

class Dog extends Animal {
    Dog() {
        super();  // calls parent constructor
        System.out.println("Dog constructor");
    }
    @Override
    void display(){
        System.out.println("this is child");
         super.display();
    }
}

public class Overriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
       
    }
}
/*
--> we cannot override a constructor 
--> but using of super can access the parent class constructor
--> using @Override we can override methods
** we cannot override final method ? **
** benifits of overriding **
we can make the new function of the parent class as per the need of the child class
*/
