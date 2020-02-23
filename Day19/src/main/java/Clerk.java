/**
 * @author zy
 * @create 2019-10-23 16:53
 */
public class Clerk {
    private int number = 0;

    //店员告知生产
    public synchronized void produc() {
        if (number < 20) {
            number++;
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+number);
            notify();
        } else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //店员卖商品
    public synchronized void cous() {
        if (number > 0) {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+number);
            number--;
            notify();
        } else {
            //等
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
