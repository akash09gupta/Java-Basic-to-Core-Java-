public class NullPointerEx {
    public static void main(String[] args) {
        try {

            String name=null;
            System.out.println(name.charAt(0));
        }
        catch (NullPointerException e) {
            // System.out.println(e);
            System.out.println("You gives null value that means nothing");
        }
    }
}
