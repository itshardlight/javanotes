//in heritance means using the propery of the parent class in the child class
class Person{
    String name;
    void display(){
        System.out.println("The name of the person is "+name);
    }
}
class Student extends Person{
    char grade;
    void display(){
        super.display();
        System.out.println("The grade of the student is "+grade);
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Student student = new Student();
        student.name="Unish Maharjan";
        student.grade='A';
        student.display();
    }
}
/*
supper keyword is used to refer to the parent class 
 */