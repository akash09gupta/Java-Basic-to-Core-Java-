public class Area_of_Square {
    void square(int num) {
        System.out.println("Area of a Square is : "+num*num);
        System.out.println("Perimeter of a Square is : "+(4*num));
    }
    public static void main(String[] args) {
        Area_of_Square sq=new Area_of_Square();
        sq.square(5);
    }
}