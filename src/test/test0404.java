package test;

import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;

/**
 * @ClassName test0404
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/4/4 0:57
 * @Version 1.0
 **/
public class test0404 {

    static volatile int i = 0;

    public static void main(String[] args) {
        ConcurrentHashMap<Character, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        Stack<Integer> stack = new Stack<Integer>();
        Semaphore semaphore = new Semaphore(2);



    }

    public synchronized int test(){
        int a = 0;

        return 0;
    }
}
