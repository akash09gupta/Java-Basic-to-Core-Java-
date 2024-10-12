public class Static_and_nonStatic {
    public static void hello() {
        System.out.println("Hello User!");
    }

    public void namaste() {
        System.out.println("Namaste User!");
    }
    public static void main(String[] args) {
        Static_and_nonStatic obj=new Static_and_nonStatic();
        hello(); //static or class method calls without creating any obj
        obj.namaste(); //non-static method calls with creating obj
    }
}
