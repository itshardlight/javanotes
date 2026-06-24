
public class Binding {
    private void display(){
        System.out.println("this is test");
    }


    public static void main(String[] args) {
        Binding test = new Binding();
        test.display();
    }
}
/*
Binding means connecting the Method with its method call 
Static(early)-->compile time (refernce type) // private static final in method
Dynamic(late)-->run time (Obj type)
*/