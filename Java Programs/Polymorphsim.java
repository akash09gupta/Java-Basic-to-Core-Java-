public class Polymorphsim {
    public void Knife() {

        System.out.println("Knife is used for cutting apples");
    }
}
class child extends Polymorphsim {
    @Override
    public void Knife() {
        System.out.println("Knife is also used for cutting mundii...");
    }
}
class letscheck{
    public static void main(String[] args) {
    child obj=new child();
    obj.Knife();
    }
}
