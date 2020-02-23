package test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数:");
        int a = scanner.nextInt();
        System.out.println("输入第二个数:");
        int b = scanner.nextInt();
//        int min = (a < b) ? a : b;
//        for (int i = min ; i >=1; i--) {
//            if (a % i == 0 && b % i == 0) {
//                System.out.println("最大公约数为:"+i);
//                break;
//            }
//        }
        int max = (a > b) ? a : b;
        for (int i =max; i < a*b; i++) {
            if (i%a==0&i%b==0){
                System.out.println("最小公倍数是"+i);
                break;
            }
        }
    }
}
