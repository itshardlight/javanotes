abstract class Bank{
    int balance;
    String name;
    public abstract void people();
  
}
class User extends Bank{
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
/*
Abstraction hides the implementation details but functionality is provided
when used abstract keyword we cannot create the instance of that class 
we have to access it using child class 
*/