import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FindingFile {
    public static void main(String[] args) {
        try {
            File obj=new File("Aksays.txt");
            Scanner myReader=new Scanner(obj);
            while (myReader.hasNextLine()) {
                String data=myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.getStackTrace();
        }
        
    }
}