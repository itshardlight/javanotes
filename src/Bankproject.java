import java.util.Scanner;

public class Bankproject {
    //here we have made the global variables
    static Scanner scanner = new Scanner(System.in);
    static double balance = 10.0;
    static boolean isRunning = true;
    static int choice=1;
    //here is the method for showing the menu
    static void menu(){
        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1. Show balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************");
    }
    //here it shows the balance
    static void showbalance(){
        System.out.println("Your balance is "+ balance);
    }
    //adds the deposit amt
    static void deposit(){
        System.out.println("Enter your deposit amount");
        double deposit = scanner.nextDouble();
        balance+=deposit;
    }
    //deducts the withdraw amt
    static void withdraw(){
        System.out.println("Enter your deposit amount");
        double deposit = scanner.nextDouble();
        if(balance<deposit){
            System.out.println("balance insufficient");
        }
        else{
             balance-=deposit;
        }
    }
    //exits the program
    static void exit(){
        isRunning = false;
    }
    //helps the user to choce according to the function we created
    static void choice(){
        System.out.println("Enter your choice (1-4):");{
            choice=scanner.nextInt();
            switch(choice){
                case 1 -> showbalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> exit();
                default-> System.out.println("Please enter a number from (1-4):");
            }
        }
    }
    //main method where all the other methods are called
    public static void main(String[] args) {
        while(isRunning){
            menu();
            choice();
        }
    }
}
