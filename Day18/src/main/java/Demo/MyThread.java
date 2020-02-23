package Demo;

/**
 * @author zy
 * @create 2019-10-23 12:35
 */
public class MyThread implements Runnable{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        Thread thread1 = new Thread(myThread);
        thread.setName("我是线程哦： ==");
        thread1.setName("er---");
        thread.start();
        thread1.start();
    }


    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%20==0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}
