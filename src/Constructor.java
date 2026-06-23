/*
this is normal method inside of a class
class normalAnimal{
    int age;
    void display(int age){
        System.out.println("age is " + age);
    }
}
public class Constructor{
    public static void main(String[] args) {
        normalAnimal normalanimal = new normalAnimal();
        //class objname = new default_constructor
        normalanimal.display(12);
        }
    }

 */

class Animal{
    Animal(int age){
        System.out.println("age is " + age);
    }
}
class Monkey{
    int age;
}
public class Constructor{
    public static void main(String[] args) {
        Animal animal = new Animal(12);
        //object creation and initialization 
        //Class objname/instance = new Constructor_call
        }
    }
/*
--> Constructor is a special method that is created 
    inside of a class having the same name as the class
--> It doesnot have a return type 
--> It runs automatically when we create an object 
--> default constructor with no constructor 
--> no args constrcutor simple method()
--> parameterised constructor method(int a)
*/