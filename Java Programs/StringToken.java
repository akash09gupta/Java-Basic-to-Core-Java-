import java.util.StringTokenizer;
public class StringToken {
    public static void main(String[] args) {
        StringTokenizer obj=new StringTokenizer("My Name is Akash");
        while ((obj.hasMoreTokens())) {
            System.out.println(obj.nextToken());
        }
    }
}
