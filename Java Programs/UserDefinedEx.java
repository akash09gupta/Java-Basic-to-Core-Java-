public class UserDefinedEx extends Exception {
    private static int AccountNumber[]={2022054,2022055,2022032};
    private static String Name[]={"Akash", "Anubhav", "Burjesh"};
    private static double Balance[]={2000, 1800, 800};

    UserDefinedEx(String str) {
        super(str);
    }

    public static void main(String[] args) {
        try {
            System.out.println("AC-Number"+"\t"+"Name"+"\t"+"\t"+"Balance");
            for(int i=0; i<3; i++) {
                System.out.println(AccountNumber[i]+"\t"+"\t"+Name[i]+"\t"+"\t"+Balance[i]);
                if(Balance[i]<1000) {
                    UserDefinedEx me=new UserDefinedEx("Sorry Burjesh ka khata khali hai");
                    throw me;
                }
            }
        }
        catch (UserDefinedEx e) {
            // e.printStackTrace();
            System.out.println(e);
        }
    }
}
