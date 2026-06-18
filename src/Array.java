import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        //normal integer array 
        int[] arr = {1,2,3,4,45};
        System.out.println(arr[1]);

        //empty array of length 5
        int[] empty = new int[5];

        //taking input from the user and sending it to the empty array
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<empty.length;i++){
            System.out.println("Type a number to send in array");
            empty[i]=scanner.nextInt();
        }
        scanner.close();

        //for each jastai
        for(int a: empty){
            System.out.println(empty[a]);
        }


    }
}
