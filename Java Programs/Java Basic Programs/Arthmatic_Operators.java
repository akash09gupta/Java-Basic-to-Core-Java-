public class Arthmatic_Operators {
    void add(int a, int b) {
        System.out.println("Sum of A & B is : "+((a+b)));
    }
    void sub(int a, int b) {
        System.out.println("Differance of A & B is : "+((a-b)));
    }
    void mul(int a, int b) {
        System.out.println("Multiply of A & B is : "+((a*b)));
    }
    void div(int a, int b) {
        System.out.println("Division of A & B is : "+((a/b)));
    }
    void mod(int a, int b) {
        System.out.println("Modular of A & B is : "+((a%b)));
    }
    public static void main(String args[]) {
        Arthmatic_Operators addition=new Arthmatic_Operators();
        Arthmatic_Operators subtraction=new Arthmatic_Operators();
        Arthmatic_Operators Multiply=new Arthmatic_Operators();
        Arthmatic_Operators Division=new Arthmatic_Operators();
        Arthmatic_Operators Modular=new Arthmatic_Operators();
        addition.add(5, 3);
        subtraction.sub(5, 3);
        Multiply.mul(5, 3);
        Division.div(5, 3);
        Modular.mod(5, 3);
    }
}
