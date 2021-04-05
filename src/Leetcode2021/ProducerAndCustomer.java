/**
 * @ClassName ProducerAndCustomer
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/26 17:40
 * @Version 1.0
 **/
public class ProducerAndCustomer {
    private static final Object lock = new Object();

    private static int count = 0;
    private static int FULL = 10;


    public static void main(String[] args) {

        new Thread(new Producer()).start();
        new Thread(new Producer()).start();
        new Thread(new Producer()).start();
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();

    }


    static class Producer implements Runnable {

        @Override
        public void run() {
            while (true) {
                sleep();
                synchronized (lock) {
                    while (count == FULL) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count ++;
                    System.out.println(Thread.currentThread().getName() + "生产者生产，目前总共有：" + count);
                    lock.notifyAll();
                }
            }
        }
    }


    static class Consumer implements Runnable {
        @Override
        public void run() {
            sleep();
            while (true) {
                synchronized (lock) {
                    while (count == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count --;
                    System.out.println(Thread.currentThread().getName() + "消费者消费，目前总共有：" + count);
                    lock.notifyAll();
                }
            }
        }
    }

    /**
     * 主要为了演示效果
     */
    private static void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
    }
}
