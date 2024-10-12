import java.util.Scanner;
class Swap_Values {
    static Scanner sc=new Scanner(System.in);
    void SwapValueWOU_third_var() {
        int a, b;
        System.out.print("Enter a : ");
        a=sc.nextInt();
        System.out.print("Enter b : ");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping a : "+a);
        System.out.println("After Swapping b : "+b);
    }
    void SwapValueU_third_var() {
        int a, b, temp;
        System.out.print("Enter a : ");
        a=sc.nextInt();
        System.out.print("Enter b : ");
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping a : "+a);
        System.out.println("After Swapping b : "+b);
    }
    public static void main(String[] args) {
        Swap_Values obj=new Swap_Values();
        System.out.print("If You want swap values without using third enter(1) else enter(2) : ");
        String user=sc.nextLine();
        if("1".equals(user)) {
            obj.SwapValueWOU_third_var();
        }
        else if("2".equals(user)) {
            obj.SwapValueU_third_var();
        }
        else {
            System.out.print("Wrong Input, Run Again");
        }
    }
}