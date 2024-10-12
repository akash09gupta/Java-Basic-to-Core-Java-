public class OverRiding {
    public void Hello() {
        System.out.println("Hello User");
    }
}
class child {
    public void Hello() {
        System.out.println("Namaste User");
    }
    public static void main(String[] args) {
        child obj=new child();
        OverRiding obj2=new OverRiding();
        obj.Hello();
        obj2.Hello();
    }
}
