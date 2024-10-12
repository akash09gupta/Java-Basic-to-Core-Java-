abstract class Abstraction {
    abstract void hello();
    public void namaste() {
        System.out.println("Namaste user!");
    }
}
class child extends Abstraction {
    void hello() {
        System.out.println("Hello User!");
    }
    public static void main(String[] args) {
        child obj=new child();
        obj.hello();
        obj.namaste();
    }
}
