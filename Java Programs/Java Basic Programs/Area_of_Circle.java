import java.util.Scanner;
public class Area_of_Circle {
    Scanner sc=new Scanner(System.in);
    void area_of_circle() {
        double radius;
        System.out.println("Enter Radius of a Circle : ");
        radius=sc.nextDouble();
        double area=3.14*radius*radius;
        double circum=2*3.14*radius;
        System.out.println("Area of Circle : "+area);
        System.out.println("Circumference of Circle : "+circum);
    }
    public static void main(String[] args) {
        Area_of_Circle area=new Area_of_Circle();
        area.area_of_circle();    
    }
}
