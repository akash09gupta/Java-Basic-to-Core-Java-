public class MutableString {
    private String name;

    MutableString(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public static void main(String[] args) {
        MutableString obj=new MutableString("Akash");
        System.out.println(obj.getName());
        obj.setName("Akash Gupta");
        System.out.println(obj.getName());

    }
}
