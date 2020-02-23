/**
 * @author zy
 * @create 2019-10-23 16:53
 * 生产
 */
public class Producer extends Thread {
    private Clerk cle;

    public Producer(Clerk cle) {
        this.cle = cle;
    }

    @Override
    public void run() {
        System.out.println("生产产品");
        for (;;) {
          cle.produc();
        }
}


}
