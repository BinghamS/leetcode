package thread;

/**
 * @ClassName thread.Solution
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/16 20:48
 * @Version 1.0
 **/
public class Solution {
    /** 表示对象锁 */
    private static final Object LOCK = new Object();

    private volatile int index = 1;//表示要输出的数字

    private volatile boolean aHasPrint = false;      //记录A是否被打印过

    class A implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                synchronized (LOCK) {
                    while (aHasPrint) {//如果A已经打印过就进行阻塞
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("线程1—" + index);//A没有打印过则输出A的值
                    index++; //输出的值增加1
                    aHasPrint = true;//表示A已经打印过
                    LOCK.notifyAll();//唤醒其它线程执行
                }
            }
        }
    }

    class B implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                synchronized (LOCK) {
                    while (!aHasPrint) {               //如果A没有打印过则阻塞
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("线程2—" + index);//输出B的值
                    index++;//计数加一
                    aHasPrint = false;//B打印完了说明新的一轮开始了，将标识为计为A没有打印过
                    LOCK.notifyAll();//唤醒阻塞线程
                }
            }
        }
    }


    public static void main(String[] args) {
        Solution solution2 = new Solution();
        Thread threadA = new Thread(solution2.new A());
        Thread threadB = new Thread(solution2.new B());
        threadA.start();
        threadB.start();
    }
}