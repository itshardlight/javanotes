class Outer{
    void display(){
        System.out.println("this is parent");
    }
}
public class Anonymousinnerclass {
    public static void main(String[] args) {
        Outer outer = new Outer(){
        void display(){
            System.out.println("this is parent");
        }
        };
    }
}
/*
It is simply overriding the parent class methods while initializing the parent methods
*/