import java.util.Scanner;
public class ASCII_value {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter any Character : ");
        char character=sc.next().charAt(0);
        int asciivalue=(int) character;
        System.out.println("Ascii value of "+character+" is : "+asciivalue);
        }
    }
