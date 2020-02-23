/**
 * @author zy
 * @create 2019-10-23 17:10
 */
public class Test {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Consumer consumer = new Consumer(clerk);
        Consumer consumer1 = new Consumer(clerk);
        Producer producer = new Producer(clerk);
        consumer.setName("消费者====");
        producer.setName("生产者");
        consumer1.setName("消费----");

        consumer.start();
        consumer1.start();
        producer.start();
    }
}
