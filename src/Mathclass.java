public class Mathclass {
    public static void main(String[] args){
        // Using maths class
        // Gives the value of PI wihtout storing in any varible we can use it directly
         System.out.println(Math.PI);

        // Gives the value of E
         System.out.println(Math.E);

        //if we want to do power of any thing we use pow
         double result = Math.pow(2,3);
         System.out.println(result);

         //abs is used for absolute value (non-negative value)
         //makes negative value positive
         System.out.println(Math.abs(-12));

         //sqrt for the square root
         double squareroot = 9;
         System.out.println(Math.sqrt(squareroot));

         //rouding up 3.5 = 4 3.14 =3
         System.out.println(Math.round(3.14));
         System.out.println(Math.ceil(3.5));//round up 
         System.out.println(Math.floor(3.5));//round down

         //max and min 
         System.out.println(Math.max(10,20));
         System.out.println(Math.min(10,20));


    }
}
