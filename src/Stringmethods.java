
public class Stringmethods {
    public static void main(String[] args){
        String name = "   Unish Maharjan    ";

        //it removes the unwanted white space
        name = name.trim();

        //length gives the length of the string
        System.out.println(name.length());

        //gives the index char of the string
        System.out.println(name.charAt(0));
        
        //to check the index no of the char 
        //if not found then it return (-1)
        System.out.println(name.indexOf("a"));

        //gives the last index of the char from the string 
        System.out.println(name.lastIndexOf("a"));
         
        //to capitalise all the string is upper and lower for lower
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //replace helps to chance the char of the string to a dif char 
        System.out.println(name.replace("a","p"));

        //check if the string is empty or not and returns in boolean formate
        System.out.println(name.isEmpty());

        //contains helps to check the particular char exists or not in the string
        //name.contains(" ") can check if there exists any space or not? 
        System.out.println(name.contains("U"));

        //checks for the given string matches with the existing string or not
        //can be used to check if the name and the pass is same in the form 
        System.out.println(name.equals("Unish Maharjan"));
    }
    
}
