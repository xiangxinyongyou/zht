package Day09;

public class ValueTranferTest {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        ValueTranferTest v = new ValueTranferTest();
        v.swap(33,22);
        System.out.println("m:====" + m+ "\tn:" +  n);
    }

    public void swap(int m,int n){
        int temp=m;
        m=n;
        n=temp;
      System.out.println("swap::::m:====" + m + "\tn:" +  m);
    }
}

class  Order{
    int orderId;
        }