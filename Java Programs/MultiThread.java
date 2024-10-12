import java.lang.Thread;
class MultiThread extends Thread {
    public void run() {
        System.err.println("The running Thread is : "+Thread.currentThread().threadId());
    }
    public static void main(String[] args) {
        int n=5; 
        for(int i=0; i<n; i++) {
            MultiThread obj=new MultiThread();
            obj.start();
        }
    }
}