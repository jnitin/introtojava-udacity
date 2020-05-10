import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileScanner {
    public static void main(String args[]) throws FileNotFoundException {
        if(args.length == 0){
            System.out.println("Input File Name not specifed ");
            return;
        }
        String filename = args[0];
        File file = new File(filename);
        Scanner filescanner = new Scanner(file);
        int wc = 0;
        while (filescanner.hasNextLine()){
            String line = filescanner.nextLine();
            wc += line.split(" ").length;

        }
        System.out.println("WC : "+wc);
    }
}
