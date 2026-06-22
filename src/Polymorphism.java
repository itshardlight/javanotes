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