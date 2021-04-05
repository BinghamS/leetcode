package thread;

public class test222 {

    public static void main(String[] args) {
        char[] char1 = "ABCDEF".toCharArray();
        char[] char2 = "GHIJKL".toCharArray();
        Object object = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (object) {//使用notify和wait时，必须要选获取到锁
                for (int i = 0; i < char1.length; i++) {
                    try {
                        System.out.print(char1[i]);
                        object.notify();
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                object.notify();//必须加上，否则程序无法结束，两个线程总有一个最后是wait状态，所以此处必须加
            }

        }, "t1");


        Thread thread2 = new Thread(() -> {
            synchronized (object) {
                for (int i = 0; i < char2.length; i++) {
                    try {
                        System.out.print(char2[i]);
                        object.notify();
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                object.notify();
            }
        }, "t2");

        thread1.start();
        thread2.start();

    }
}