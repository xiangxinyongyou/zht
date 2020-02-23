package test1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////        System.out.println("输出字符串");
////        String next = scanner.next();
////        System.out.println(next);
////        int i = scanner.nextInt();
////        System.out.println(i);
        int sum=0;
        for (int i = 0; i <= 100; i++) {

            if (i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    }

