package Demo1;

/**
 * @author zy
 * @create 2019-10-23 10:11
 */
public class Aa{
    public static void main(String[] args) {
        ThreadDemo d1 = new ThreadDemo();
        ThreadDemo2 d2 = new ThreadDemo2();
        d1.setName("线程one");
        d1.start();
        Thread.currentThread().setName("主");
//        d2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i+"-------------");
        }


        new ThreadDemo(){

            @Override
            public void run() {

                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }

        }.start();
    }
}

 class ThreadDemo extends Thread{
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i+"====ThreadDemo=======");
            }
        }
    }
}
 class ThreadDemo2 extends Thread{
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i+"====ThreadDemo====222===");
            }
        }
    }
}