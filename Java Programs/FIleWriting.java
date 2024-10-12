import java.io.FileWriter;
import java.io.IOException;
public class FIleWriting {
    public static void main(String[] args) {
        try {
            FileWriter obj=new FileWriter("AkSays.txt");
            obj.write("Hello Developer Akash");
            obj.close();
            System.out.println("Successfully Wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred");
            e.getStackTrace();
        }
    }
}
