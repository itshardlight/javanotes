public class Breakandcontinue {
    public static void main(String[] args) {
        //here it prints the value till the 1 and stop when the value reached 2
        for(int i = 0;i<5;i++){
            if(i==2){
                break;
            }
            else{
                System.out.println("this is the value of i "+ i);
            }
        //here it skips the value 2 and prints the rest like a normal for loop 
        for(int j = 0;j<5;j++){
            if(j==2){
                continue;
            }
            else{
                System.out.println("this is the value of j "+ j);
            }   
        }
    }
}}
