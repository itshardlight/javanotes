import java.util.Scanner;
// we must import the packages inorder to take input from the users
public class Userinput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // Scanner is class 
        // scanner is object (can me any thing a b c )
        System.out.println("Enter your name: ");
        // sout shortcut to bring the System.out.println
        String nospace = scanner.next(); 
        //saving the taken input in the variable nospace
        scanner.nextLine();
        //clean left over inputs
        System.out.println("Enter your name again: ");
        // doesnot take input after space
        String space = scanner.nextLine(); 
        // includes space

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter your Gpa:");
        double gpa = scanner.nextDouble(); 

        System.out.println("Are u a teacher? (true/false)");
        boolean isTeacher = scanner.nextBoolean();

        //printing the taken input from the user
        System.out.println("This is with space: "+space);
        System.out.println("This is with no space: "+nospace);
        System.out.println("Your age is: "+ age);
        System.out.println("Your Gpa is: "+ gpa);
        if(isTeacher){
            System.out.println("You are a teacher!");
        }
        else{
            System.out.println("You are a student!");
        }

        scanner.close();
        // may lead to unexpected behaviour when not closed
    }
}
