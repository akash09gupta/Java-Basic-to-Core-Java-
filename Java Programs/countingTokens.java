import java.util.StringTokenizer;
public class countingTokens {
    public static void main(String[] args) {
        StringTokenizer obj=new StringTokenizer("My Name is Akash");
        System.out.println("Total Tokens : "+obj.countTokens());
    } 
}

