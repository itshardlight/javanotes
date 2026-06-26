class Animal {
    Animal(){
        System.out.println("This is Animal class");
    }
    class Dog{
        Dog(){
            System.out.println("This is Dog class");
        }
    }
}
public class Innerclass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal.Dog dog = animal.new Dog();

    }
}
