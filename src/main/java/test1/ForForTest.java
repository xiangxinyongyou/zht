package test1;

public class ForForTest {
    public static void main(String[] args) {
//        for (int j = 1; j <= 5; j++) {
//            System.out.println();
//            for (int i = 1; i <=j; i++) {
//                System.out.print("* ");
//            }
//        }
//        System.out.println("================");
        for (int j =1; j <= 5; j++) {
            System.out.println();
            for (int i = 6; i > j; i--) {
                System.out.print("* ");
            }
        }
    }
}
