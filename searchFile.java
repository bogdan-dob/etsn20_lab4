import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class searchFile {

    public static void printLines(String pattern, String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while(scanner.hasNextLine()) {
                if(scanner.nextLine().contains(pattern)) {
                    System.out.println(scanner.nextLine());
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
       if(args.length != 3) {
        System.out.println("Incorrect number of arguments. Format should be: search <pattern> <file>");
       } else if(!args[0].equals("search")) {
        System.out.println("Incorrect command. Format should be: search <pattern> <file>");
       } else {       
       printLines(args[1], args[2]);
       }
    }
}