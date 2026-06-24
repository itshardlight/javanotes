class Parent {
    Parent(){
        System.out.println("this is super");
    }
}
class Child extends Parent{
    {
        System.out.println("this is initializer block");
    }
    Child(){
       System.out.println("this is child");
    }
}
   public class InitializerBlock {
    public static void main(String[] args) {
            Parent parent = new Parent();
            Child child = new Child();
    }
}
/*
initializer block is called before the constructor 
*/