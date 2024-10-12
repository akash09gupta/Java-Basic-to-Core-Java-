class SimpleProgram {
    public int sum(int num, int num2) {
        return num+num2;
    }
    public static void main(String args[]) {
        SimpleProgram obj=new SimpleProgram();
        int result=obj.sum(5, 6);
        System.out.println("Sum of Numbers is : "+result);
    }
}