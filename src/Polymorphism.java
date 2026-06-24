//polymorphism means using the same method but replacing the content of the method 
class Shape{
    void draw(){
        System.out.println("this is the shape class parent");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("this is circle child class");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("this is rectangle child class");
    }
}
public class Polymorphism{

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        Shape shape = new Rectangle();
        shape.draw();
    }
}
/*
reusing the method but with the dif functationality 
runtime/virtual: same name and same parameter but dif functationality 
(reference type is checked in compile time)
compile: same name but dif parameters and dif functationality 
(object type dif is checked in run timie)
*/