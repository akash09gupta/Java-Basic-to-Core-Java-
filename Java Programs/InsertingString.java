public class InsertingString {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("Akash Bareilly");
        System.out.println("String Without Inserting : "+obj);
        obj.insert(5, " Gupta");
        System.out.println("String After Inserting : "+obj);
    }
}
