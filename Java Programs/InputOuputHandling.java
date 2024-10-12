import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputOuputHandling {

    String name;
    int id;
    int age;
    
    InputOuputHandling(String name, int id, int age) {
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public void displayDetails() {
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name : ");
        String name=obj.readLine();
        System.out.println("Enter ID : ");
        int id=Integer.parseInt(obj.readLine());
        System.out.println("Enter Age : ");
        int age=Integer.parseInt(obj.readLine());
        InputOuputHandling emp=new InputOuputHandling(name, id, age);
        emp.displayDetails();
    }
}
