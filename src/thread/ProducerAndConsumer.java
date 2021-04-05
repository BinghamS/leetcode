package thread;

import java.util.*;

/**
 * @ClassName ProducerAndConsumer
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/30 12:52
 * @Version 1.0
 **/
public class ProducerAndConsumer {

    public final int MAX_SIZE = 10;

    public volatile Queue<Integer> queue= new LinkedList();

    public volatile int index = 0;

    class Producer implements Runnable{

        @Override
        public void run() {
            while (true) {
                synchronized (queue){
                    while (queue.size() == MAX_SIZE){
                        try {
                            queue.wait();
                        }catch(Exception ex){
                            ex.printStackTrace();
                        }
                    }
                    queue.add(index);
                    index++;
                    System.out.println(queue);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                    queue.notifyAll();

                }
            }
        }
    }

    class Consumer implements Runnable{
        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.size() == 0) {
                        try {
                            queue.wait();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                    queue.poll();
                    System.out.println(queue);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                    queue.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ProducerAndConsumer producerAndConsumer = new ProducerAndConsumer();
        Thread producer = new Thread(producerAndConsumer.new Producer());
        Thread consumer = new Thread(producerAndConsumer.new Consumer());

        producer.start();

        consumer.start();

    }
}
