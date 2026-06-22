public abstract class Bank{
    int balance;
    String name;
    public abstract void people();
  
}
public class User extends Bank{
    @Override
    public void people(){
        System.out.println("this is user");
    }
}
public class Abstraction {
    public static void main(String[] args) {
    User user = new User();
    user.people();
    }
}
