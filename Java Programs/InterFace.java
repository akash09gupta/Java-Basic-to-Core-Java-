interface Interface_Class{
    public void ram_ram();
    public void Namaste();
    public void Hello();
} 
class child implements Interface_Class {

    public void ram_ram() {
        System.out.println("Ram Ram Bhai Sarayanee!");
    }
    public void Namaste() {
        System.out.println("Namaste User!");
    }
    public void Hello() {
        System.out.println("Hello User!");
    }
    public static void main(String[] args) {
        child obj=new child();
        obj.ram_ram();
        obj.Namaste();
        obj.Hello();
    }
}