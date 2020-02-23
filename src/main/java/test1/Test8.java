package test1;

public class Test8 {
    public static void main(String[] args) {
        boolean m = true;
        int count = 0;
        int count1 = 0;
        long star = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) {
           // for (int j = 2; j < i; j++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    m = false;
                    System.out.println("非质数为"+i);
                    count1++;

                   break;
                }

            }
            if (m == true) {
              //  System.out.println("我是质数" + i);
                count++;
            }
            m = true;
        }
        long end = System.currentTimeMillis();
        System.out.println("===============");
        System.out.println("质数的个数"+count);
        System.out.println("非质数的个数"+count1);
        System.out.println("时间为" + (end - star)); // 不打印 //1.无break===>23824   2.有break 2799  3. 开方后52
    }


}

