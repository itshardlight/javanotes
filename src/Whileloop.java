public class Whileloop {
    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        ***** */    
        
        int i = 0;
        int j = 0;
        while (i<6){
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            j=0;
            i++;
        }
    }
}
