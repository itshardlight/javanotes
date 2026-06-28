
public class Rough{
    public static void main(String[] args) {
        // int[] age = {1,2,3,4};
        // for(int a:age){
        //     System.out.println(a);
        // }
        int[][] test={{1,2},{2,3,4},{3},{3}};
        for(int[] i:test){
            for(int j:i){
                System.out.println(j);

            }
        }

    }
}