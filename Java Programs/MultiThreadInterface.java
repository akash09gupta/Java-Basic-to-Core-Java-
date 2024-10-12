class MultiThreadInterface implements Runnable {
    public void run() {
        System.out.println("The running Thread is : "+Thread.currentThread().threadId());
    }
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n; i++) {
            Thread obj=new Thread(new MultiThreadInterface());
            obj.start();
        }
    }
}