import java.util.Scanner;
public class Arithmeticoperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        char operator;

        System.out.println("Enter the first number:");
        num1=scanner.nextInt();
        System.out.println("Enter the second number:");
        num2=scanner.nextInt();
        System.out.println("Choose the operator('+','-','/','*')");
        operator =scanner.next().charAt(0);

        if(operator=='+'){
            System.out.println("The addition of "+num1+" and "+num2+" is: "+(num1+num2));
        }
        else if(operator=='-'){
            System.out.println("The subtraction of "+num1+" and "+num2+" is: "+(num1-num2));
        }
        else if(operator=='*'){
            System.out.println("The multiple of "+num1+" and "+num2+" is: "+(num1*num2));
        }
        else if(operator=='/'){
            System.out.printf("The division of "+num1+" and "+num2+" is: %.2f",((float)num2/num1));
            //printf for formated printing where we use %d %f %2f and the variable are separated by ,
        }
    }
}
