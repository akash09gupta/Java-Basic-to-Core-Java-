public class OverLoading {
    public int sum(int num, int num2) {
        return num+num2;
    }
    public int sum(int num, int num2, int num3) {
        return num+num2+num3;
    }
    public static void main(String[] args) {
        OverLoading obj=new OverLoading();
        OverLoading obj2=new OverLoading();
        int r1=obj.sum(5, 6);
        int r2=obj2.sum(5, 6, 6);
        System.out.println("Result 1 : "+r1);
        System.out.println("Result 2 : "+r2);
    }
}
