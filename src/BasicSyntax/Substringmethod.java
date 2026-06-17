public class Substringmethod {
    public static void main(String[] args){
        String email = "unish@gmail.com";
        
        //substring helps to make a new string by taking the char from the existing string
        String username = email.substring(0,5);
        System.out.println(username);

        //more flexible for all kinds of email cause the index no is not same for all the emails
        System.out.println(email.substring(0,email.indexOf('@')));

        //will take the char from that  char index
        System.out.println(email.substring(6));
    }
}
