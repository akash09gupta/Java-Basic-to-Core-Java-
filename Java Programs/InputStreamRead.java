import java.io.InputStreamReader;
import java.io.FileInputStream;
public class InputStreamRead {
    public static void main(String[] args) {
        char array[]=new char[150];
        try {
        FileInputStream file=new FileInputStream("E:\\Java Programs\\AkSays.txt");
        InputStreamReader input=new InputStreamReader(file);
        input.read(array);
        System.out.println("Data in the Stream");
        System.out.println(array);
        input.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}