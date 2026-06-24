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
/*
Encapsulation means keeping the variables private and restricting the use of those variables
indirect method--> getter and setter method where we can use to send the value or change the value using method 
types of encapsulaiton 
read only using getter 
write only using setter 
fully encapsulated using both getter and setter 
*/