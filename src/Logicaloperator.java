public class Logicaloperator {
    public static void main(String[] args) {
        int age= 22;
        int roll=12;
        Boolean girl = false;
        if(age>10 && girl == false){
            System.out.println("She is a girl and is older than 10");
        }
        if(age>10 || roll>12){
            System.out.println("She is greater than 10 or roll number is greater than 12");
        }
        if(age != 10){
            System.out.println("she is not 10 years old");
        }

    }
}
