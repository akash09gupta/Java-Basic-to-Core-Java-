import java.io.File;
import java.io.IOException;
public class FileHandle {
    public static void main(String[] args) {
        try {
        File obj=new File("E:\\Java Programs\\AkWrites.txt");
        if(obj.createNewFile()) {
            System.out.println("File Created"+obj.getName());
        }
        else {
            System.out.println("File already exits...");
        }
    }
        catch (IOException e) {
        e.getStackTrace();
    }
}
}
