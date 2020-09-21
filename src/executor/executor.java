package executor;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class executor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 5; i++) {
            final int task = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 1; j <= 5; j++) {
                        System.out.println(Thread.currentThread().getName()+"    "+"task:"+task+"times:"+j);
                    }
                }
            });
        }
        executorService.shutdown();

        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(87);
        arrayList.remove(1);
        arrayList.toString();
    }

    public void levelOrder(){
        Queue<TreeNode> queue = new LinkedList<>();

    }

}
