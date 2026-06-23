class Parent{
    private int age=12; //only access within this class only 
    public static int accessCount=0;
    String name;
    private double balance;
    public void setBalance(double a){
        balance =a;
    }     
    public double getBalance(){
        accessCount++;
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