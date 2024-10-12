public class replaceString {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("Akash Bareilly");
        System.out.println("String after replacing : "+obj);
        obj.replace(6, 14, "Gupta");
        System.out.println("String after replacing : "+obj);
    }
}
