package test;

public class testThread {
    public static final Object lock = new Object();
    public volatile int index = 1;
    private volatile boolean aHasPrint = false;
    class a implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                synchronized (lock){
                    while (aHasPrint){
                        try {
                            lock.wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println("a:"+index);
                    index++;
                    aHasPrint =true;
                    lock.notifyAll();
                }
            }
        }
    }
    class b implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                synchronized (lock){
                    while (!aHasPrint){
                        try {
                            lock.wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println("b:"+index);
                    index++;
                    aHasPrint =false;
                    lock.notifyAll();
                }
            }
        }
    }
    public static void main(String[] args) {
        testThread testThread = new testThread();
        Thread threada = new Thread(testThread.new a());
        Thread threadb = new Thread(testThread.new b());
        threada.start();
        threadb.start();
    }
}
