public class Inheritance {
    public int sum(int num, int num2) {
        return num+num2;
    }
}
class Child_Class extends Inheritance {
    public static void main(String[] args) {
        Child_Class obj=new Child_Class();
        int result=obj.sum(6, 10);
        System.out.println("Sum of Two Numbers : "+result);
    }
}
