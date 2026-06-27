class Outer{
    private static Outer outer = new Outer();
    private Outer() {}
    public static Outer getOuter(){
        return outer;
    }

}
public class Singletonclass{
    public static void main(String[] args) {
        Outer o1 = Outer.getOuter();
    }
}