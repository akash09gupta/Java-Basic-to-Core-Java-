import java.util.StringTokenizer;
public class nextToken {
    public static void main(String[] args) {
        StringTokenizer obj=new StringTokenizer("My,Name,is,Akas");
        System.out.println("Next Token is "+obj.nextToken(","));
    }
}
