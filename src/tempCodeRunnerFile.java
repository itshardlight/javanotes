class Parent{
    private int age; //only access within this class only 
    String name;

}
public class Encapsulation{
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.age=12;
        parent.name="unish";
        System.out.println(parent.age);
        System.out.println(parent.name);
    }
}