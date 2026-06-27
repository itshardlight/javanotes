class Outer{
    static class Inner{
        Inner(){
            System.out.println("This is static inner class");
        }

    }
}
public class Staticclass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        
    }
}
/*
Static inner class 
--> we can directly access the inner class 
*/