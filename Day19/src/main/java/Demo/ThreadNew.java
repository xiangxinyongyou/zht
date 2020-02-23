package Demo;

import sun.awt.image.IntegerInterleavedRaster;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author zy
 * @create 2019-10-23 17:34
 * <p>
 * 实现Callable接口
 */
class NumThread implements Callable {

    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <=100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+ i);
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}

public class ThreadNew {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);
        Thread thread = new Thread(futureTask);
        thread.start();
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+ i);
        }
    }
}
