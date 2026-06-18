public class Methods {
    //void means no return
    //this is a normal method were we can use it by calling its name in the main method
    static void print(){
            System.out.println("this method prints");
         }
    //here we are having parameters which is replaced by the argument that is passed when calling it
    static void happybirthday(String name){

        System.out.println("Happy birthday dear "+ name);
    }

    //age generator by dob method
    //we have to mention the type of the return if we are not using void
    static int age(int dob){
        return 2026-dob;
    }

    public static void main(String[] args) {
        //calling the first method
          print();
           
          //normal method plus sending the argument 
          happybirthday("Unish");

          System.out.println(age(2005));
    }
    
       
}
