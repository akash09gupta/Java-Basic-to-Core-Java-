public class Area_of_Rectangle {
    void area_of_Rectangle(int l, int b) {
        int area=l*b;
        int peri=2*(l+b);
        System.out.println("Area of a Rectangle is : "+area);
        System.out.println("Perimeter of a Rectangle is : "+peri);
    }
    public static void main(String[] args) {
        Area_of_Rectangle obj=new Area_of_Rectangle();
        obj.area_of_Rectangle(6, 2);
    }
}
