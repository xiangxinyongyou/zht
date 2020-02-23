/**
 * @author zy
 * @create 2019-10-23 16:53
 */
public class Consumer extends Thread{


   private Clerk cle;

    public Consumer(Clerk cle) {
        this.cle = cle;
    }

    @Override
    public void run() {

        System.out.println("消费产品");
        while (true){
            cle.cous();
        }
    }
}
