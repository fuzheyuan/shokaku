package azure.lane.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Zheyuan Fu
 * @date 2019.06.10
 */
public class FutureTaskTest implements Callable<Integer> {
    @Override
    public Integer call() {
        int i = 0;
        for(; i < 100; i ++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }
    public static void main(String[] args) {
        FutureTaskTest futureTaskTest = new FutureTaskTest();
        FutureTask<Integer> futureTask = new FutureTask<>(futureTaskTest);
        for(int i = 0; i < 100; i ++) {
            System.out.println(Thread.currentThread().getName() + " 的循环变量i的值" + i);
            if(i == 20) {
                new Thread(futureTask, "有返回值的线程").start();
            }
        }

        try {
            System.out.println("子线程的返回值" + futureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
