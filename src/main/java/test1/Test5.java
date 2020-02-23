package test1;

public class Test5 {
    public static void main(String[] args) {
//左对齐直角
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("\n");
        //左对齐倒直角
        for (int a = 0; a <= 5; a++) {
            for (int b = a; b<5; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("\n");
        //左对齐倒直角
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("\n");
        //右对齐倒直角
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }
            for (int k = 1; k <= 5-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //右对齐直角
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
