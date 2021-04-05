package thread;

import java.util.concurrent.locks.*;

/**
 * @ClassName ABC_lock
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/27 16:10
 * @Version 1.0
 **/
public class ABC_lock {
    private static Lock lock = new ReentrantLock();//通过JDK5中的Lock锁来保证线程的访问的互斥
    private static int state = 0;

    static class ThreadA extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; ) {
                try {
                    lock.lock();
                    while (state % 3 == 0) {//多线程并发，不能用if，必须用循环测试等待条件，避免虚假唤醒
                        System.out.println("A" + i);
                        state++;
                        i++;
                    }
                } finally {
                    lock.unlock();// lock()和unlock()操作结合try/catch使用
                }
            }
        }
    }

    static class ThreadB extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; ) {
                try {
                    lock.lock();
                    while (state % 3 == 1) {//多线程并发，不能用if，必须用循环测试等待条件，避免虚假唤醒
                        System.out.println("B" + i);
                        state++;
                        i++;
                    }
                } finally {
                    lock.unlock();// lock()和unlock()操作结合try/catch使用
                }
            }
        }
    }

    static class ThreadC extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; ) {
                try {
                    lock.lock();
                    while (state % 3 == 2) {//多线程并发，不能用if，必须用循环测试等待条件，避免虚假唤醒
                        System.out.println("C" + i);
                        state++;
                        i++;
                    }
                }catch(Exception ex){
                    ex.printStackTrace();
                } finally{
                    lock.unlock();// lock()和unlock()操作结合try/catch使用
                }
            }
        }
    }

    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
        new ThreadC().start();
    }
}
