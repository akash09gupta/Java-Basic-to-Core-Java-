class Ex {
    public static void main(String[] args) {
        int a=5, b=0;
        try {
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Please check your input value because "+a+" can't divide by "+b);
        }
        finally {
            System.out.println("Program Excuted Successfully.");
        }
        int p=5, q=8, r=p+q;
        System.out.println("Sum of two num : "+r);
    }
}
