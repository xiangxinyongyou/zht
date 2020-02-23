package Test3;


import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的数量");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("请输入" + x + "个学生的分数");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        char leave;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= (max - 10)) {
                leave = 'A';
            } else if (arr[i] >= max - 20) {
                leave = 'B';
            } else if (arr[i] >= max - 30) {
                leave = 'C';

            } else {
                leave = 'D';

            }
            System.out.println("编号" + i + "分数" + arr[i] + "等级" + leave);
        }
    }
}
