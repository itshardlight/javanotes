class Outer {
    private int age =12;
    Outer(){
        System.out.println("This is Outer class");
    }
    class Inner{
        Inner(){
            System.out.println("This is the private variable of outer class "+age);
            System.out.println("This is Inner class");
        }
    }
}
public class Innerclass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
      
    }
}
/*
Outer class {Inner class}
--> Inner class can access the private variable of the outer class also 
( Can avoid getter and setter method for the private class )
--> Encapsulation 
Inner class can be hidden as it cannot be accessed directly without the help of Outerclass
*/
