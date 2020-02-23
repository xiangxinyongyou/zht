package Day08;

import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) {
        Studentt[] arr = new Studentt[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Studentt();

            arr[i].number = i + 1;
            arr[i].state = (int) (Math.random() * 6 + 1);
            arr[i].score = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i < arr.length; i++) {
//            String s = "000sfthj"+String.valueOf(arr[i].number);
//            System.out.println(s);
            System.out.println(arr[i].xiix());
        }
        System.out.println("==========================");
//排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].score > arr[j + 1].score) {
                    Studentt temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
//            String s = "000sfthj"+String.valueOf(arr[i].number);
//            System.out.println(s);
            System.out.println(arr[i].xiix());
            count++;
        }
        System.out.println(count);
    }


}
