class Student{
    static int section =12;
    // instance variable in class
    int year = 1234;
    int age;
    String name;
    int rollno;
    void print(int classno){
    int i=0;//local variable in class  
    while(i<2){
    System.out.println("My name is "+ name +",was born in "+(2026-age)+", and my roll no is "+rollno+" ,and i am studying in "+classno+" class");
    i++;
    }
    }
}
public class Class {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.age = 20;
        student1.rollno =123;
        student1.name="Unish Maharjan";
        student1.print(12);
        Student.section=1;
        System.out.println(Student.section);
        System.out.println(student1.year);
    }
}
