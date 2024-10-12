public class throwsKeyword {
    public static void divide(int a, int b)
    throws ArithmeticException {
        if(b==0) {
            throw new ArithmeticException("Can not divide by zero");
        }
        int result=a/b;
        System.out.println("Result : "+result);
    }
    public static void main(String[] args) {
        int a=5, b=0;
        try {
            divide(a, b);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception occured : "+e.getMessage());
        }
    }
}
