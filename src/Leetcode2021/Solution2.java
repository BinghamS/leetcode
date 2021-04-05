/**
 * @ClassName thread.Solution
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/16 20:48
 * @Version 1.0
 **/
public class Solution2 {
    private static final Object lock = new Object();

    private volatile int index = 1;

    private volatile boolean aHasPrint = false;

    class A implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                synchronized (lock) {
                    while (aHasPrint) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("线程1—" + index);
                    aHasPrint = true;
                    lock.notifyAll();
                }
            }
        }
    }

    class B implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                synchronized (lock) {
                    while (!aHasPrint) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("线程2—" + index);
                    index++;
                    aHasPrint = false;
                    lock.notifyAll();
                }
            }
        }
    }


    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        Thread threadA = new Thread(solution2.new A());
        Thread threadB = new Thread(solution2.new B());
        threadA.start();
        threadB.start();
    }
}
