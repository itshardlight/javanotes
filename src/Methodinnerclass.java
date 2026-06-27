class Outer{
    void display(){
        class Inner{
            int age = 12;
        }
        Inner inner = new Inner();
        System.out.println(inner.age);
    }
}

public class Methodinnerclass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}
/*
Method-inner method (local)
--> here we cannot access the inner class directly form the outter class
--> class(method(inner class))
--> we have to inisiate the innner class inside of the same method 

*/