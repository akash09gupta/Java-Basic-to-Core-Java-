public class Encapsule {
    private String Name;
    private int Id;

    public String getName() {
        return Name;
    }
    public int getId() {
        return Id;
    }
    public void setName(String Name) {
        this.Name=Name;
    }
    public void setId(int Id) {
        this.Id=Id;
    }
}
class test {
    public static void main(String[] args) {
        Encapsule obj=new Encapsule();
        obj.setId(101);
        obj.setName("Akash");
        System.out.println("ID : "+obj.getId());
        System.out.println("Name : "+obj.getName());
    }   
}
