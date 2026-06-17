import java.util.Random;
public class Randomclass {
    public static void main(String[] args){
        Random random = new Random();
        // generating random number
        int number;
        number = random.nextInt();
        System.out.println(number);
       
        //printing the random number with in the limit starting and the ending (a,b)
        // a = inclusive b = exclusive 
        int fixednumber  = random.nextInt(1,6);
        System.out.println(fixednumber);
    }
}
