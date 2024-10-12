public class ImmutableString {
    private String name;
    
    ImmutableString(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ImmutableString obj=new ImmutableString("Akash");
        System.out.println(obj.getName());
    }
}