class Animal{
    int age=12;
}
class Dog{
    Animal animal1 = new Animal();
    Dog(){
        System.out.println(animal1.age);
    }
}
class Cat{
    Animal animal2;
    Cat(Animal animal2){
        System.out.println(animal2.age);
    }
}
public class Rough{
    public static void main(String[] args) {
        Animal animal2 = new Animal();
        Cat cat = new Cat(animal2);
    }
}