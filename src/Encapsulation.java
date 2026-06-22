class Parent{
    private int age=12; //only access within this class only 
    String name;
    private double balance;
    public void setBalance(double a){
        balance =a;
    }
    public double getBalance(){
        return balance;
    }
    public int getAge(){
        return age;
    }

}

public class Encapsulation{
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.name="unish";
        parent.setBalance(20.34);
        System.out.println(parent.getBalance());
        System.out.println(parent.getAge());
        System.out.println(parent.name);
    }
}