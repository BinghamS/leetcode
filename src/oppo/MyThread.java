package oppo;

public class MyThread implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    public MyThread(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {

        int i = 0;
        while (++i <= 10) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.println(name);

                    self.notifyAll();
                }

                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("done");

    }


    public static void main(String []args) throws InterruptedException {

        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        MyThread threadA = new MyThread("A", c, a);
        MyThread threadB = new MyThread("B", a, b);
        MyThread threadC = new MyThread("C", b, c);

        Thread A = new Thread(threadA);
        A.start();
        Thread.sleep(100);
        Thread B = new Thread(threadB);
        B.start();
        Thread.sleep(100);
        Thread C = new Thread(threadC);
        C.start();

        Thread.sleep(3000);

        A.interrupt();
        B.interrupt();
        C.interrupt();
    }
}
