package Demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zy
 * @create 2019-10-23 18:12
 */

//可以修改实现线程的方式如Callable接口和继承Thread类
class TestThread implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        //左边是接口
        ExecutorService pool = Executors.newFixedThreadPool(11);
        //设置线程池的属性
        System.out.println(pool.getClass());//ThreadPoolExecutor
        //左边是接口的实现类对象（多态）
        ThreadPoolExecutor tpe = (ThreadPoolExecutor) pool;
        //设置线程池的属性
        tpe.setCorePoolSize(3);//设置连接池的大小
        tpe.setKeepAliveTime(2, TimeUnit.MINUTES);//存活时间
        TestThread testThread = new TestThread();
        pool.execute(testThread);//适用于Runnable接口
        // pool.submit(Callable call);//Callable接口
        //关闭连接池
        pool.shutdown();

    }
}
