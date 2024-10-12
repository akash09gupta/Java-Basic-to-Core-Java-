public class DeleteString {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("Akash Gupta abc");
        System.out.println("String Before Deletion : "+obj);
        obj.delete(12, 15);
        System.out.println("String After Deletion : "+obj);
    }
}
