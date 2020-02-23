package Day09;

public class Test3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        Test3 t = new Test3();
        t.method(a, b);
//int d=1/0;
        System.out.println("a====" + a);
        System.out.println("b====" + b);
    }

    private void method(int a, int b) {
        a = a * a;
        b = 20 * b;
        System.out.println("meth:" + a);
        System.out.println("meth:" + b);
       System.exit(0);

    }
}
