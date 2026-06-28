import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Filehandling {
    public static void main(String[] args) {
        /*
         * 
         * try{
         * File file = new File("file.txt");
         * FileWriter write = new FileWriter("file.txt");
         * write.write("hi there");
         * write.close();
         * 
         * Scanner scanner = new Scanner(file);
         * while(scanner.hasNextLine()){
         * String data = scanner.nextLine();
         * System.out.println(data);
         * }
         * file.delete();
         * 
         * }
         * catch(Exception e){
         * 
         * }
         */
        try {
            File folder = new File("Test");
            folder.mkdir();
            File file = new File("Test/File.txt");
            file.createNewFile();
            FileWriter text = new FileWriter("Test/File.txt");
            text.write("hi this is test");
            text.close();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
            file.delete();
            folder.delete();
        } catch (Exceptiontypes e) {

        }

    }
}