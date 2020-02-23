package cn.zy;

/**
 * @author zy
 * @create 2019-11-17 16:23
 */
public class DiGui {
    public int f(int n) {

        if (n == 1 || n == 2) {

            return n;
        }
        // return f(n - 2) + f(n - 1);
        int one = 2;
        int two = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;
    }


}
