import java.util.Scanner;
class Converting_temp {
    static Scanner sc=new Scanner(System.in);
    void Celsius() {
        System.out.println("Enter temperature in Fahreneit : ");
        double temp1=sc.nextDouble();
        double result1=(temp1-32)*5/9;
        System.out.println("Temperature in Celsius : "+result1+" C");
    }
    void Fahreneit() {
        System.out.println("Enter temperature in Celsius : ");
        double temp2=sc.nextDouble();
        double result2=(temp2*9/5)+32;
        System.out.println("Temperature in Celsius : "+result2+" F");
    }
    public static void main(String[] args) {
        Converting_temp obj=new Converting_temp();
        System.out.println("Choose Temperature (Celsius(C)/Fahreneit(F)) : ");
        String user=sc.nextLine();
        if("C".equals(user)) {
            obj.Celsius();
        }
        else if("F".equals(user)) {
            obj.Fahreneit(); 
        }
        else {
            System.out.print("Wrong input run again...");
        }
    }
}