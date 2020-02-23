package MaiPiao;

/**
 * @author zy
 * @create 2019-10-23 11:35
 * 三个窗口卖票的测试    给属性添加一个static  可以保证三个线程共用一个属性，如果不加static 每个线程
 * 拥有属于自己 的一套属性。
 * 注意：这个测试存在线程安全的问题，待解决ToDo
 */


public class WindownTest {
    public static void main(String[] args) {
   /*     Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();*/
        Window w = new Window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }

}

class Window implements Runnable {
    //  class Window extends Thread {
    //  private static int ticket = 100;
    private int ticket = 100;
    Object obj = new Object();

    public void run() {

        for (; ; ) {
//            synchronized (obj) {
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(20);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + ":===" + ticket);
//                    ticket--;
//                } else {
//                    break;
//                }
//            }

            show();
        }
    }

    private synchronized void show() {
        if (ticket > 0) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":===" + ticket);
            ticket--;
        }
    }
//    @Override
//    public void run() {
//        for (; ; ) {
//            if (ticket > 0) {
//                System.out.println(getName() + ":===" + ticket);
//                ticket--;
//            } else {
//                break;
//            }
//
//        }
//    }
}
