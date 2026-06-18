public class Forloop {
 public static void main(String[] args) {
    // initializtion;condition;incremt or decrement;
    for(int i =0;i<3;i++){
        System.out.println("this is the value of i in each iteration "+i);
    }
    int[] arr = {1,2,3,4};

    //enhanced for loop more like for each
    for(int a : arr){
        System.out.println(a);
    }
 }   
}
