import java.util.Scanner;
public class Square_and_Cube {
    Scanner sc=new Scanner(System.in);
    void Sq_and_Cu() {
        System.out.println("Enter any num : ");
        int num=sc.nextInt();
        System.out.println("Square of a number is : "+(num*num));
        System.out.println("Cube of a number is : "+(num*num*num));
    }
    public static void main(String[] args) {
        Square_and_Cube obj=new Square_and_Cube();
        obj.Sq_and_Cu();
    }
}
