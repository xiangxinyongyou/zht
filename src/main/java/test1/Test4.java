package test1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1=0;
        int count2=0;
      for(;;) {// while (true){
            int i = scanner.nextInt();
          if (i>0){
              count1++;
          }else if(i<0){
              count2++;
          }else {
              break;
          }
        }
        System.out.println("整数"+count1);
        System.out.println("负数"+count2);
    }
}
