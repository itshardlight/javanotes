class Parent{
    int add(int a, int b){
        return a+b;
    }

}
class Child extends Parent{
    int add(int a,int b){
        return a-b;
    }
}
public class Methodoverriding{
    public static void main(String[] args){
        Child child = new Child();
        System.out.println(child.add(3,4));
    }
}