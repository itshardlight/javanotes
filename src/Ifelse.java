public class Ifelse {
    public static void main(String[] args){
        int age = 18; 
        // if else 
        if(age>18){
            System.out.println("This person is legal.");
        }
        else{
            System.out.println("This person is not legal.");
        }

        //if else if else 
        boolean isBoy = true;
        if(age>18 & isBoy){
            System.out.println("He is Legal.");
        }
        else if(age>18){
            System.out.println("She is Legal.");
        }
        else if (isBoy){
            System.out.println("He is not Legal.");
        }
        else{
            System.out.println("She is not Legal.");
        }
    }
}
