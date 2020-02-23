package Demo;

/**
 * @author zy
 * @create 2019-10-23 9:52
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {

        for (int i = 0; i <2000; i++) {
            if (i%2!=0){

                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        ThreadDemo threadDemo1 = new ThreadDemo();
        threadDemo1.start();

        for (int i = 0; i < 2000; i++) {
            if (i%2==0){
                System.out.println("我是main"+"============"+i);
            }
        }
    }
}
