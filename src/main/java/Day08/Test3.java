package Day08;

public class Test3 {
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        int are = test3.meth(3,8);
        System.out.println(are);
//        int are = test3.method();
//        System.out.println(are);
      //  System.out.println("面积是"+test3.method());

    }

//    private int method() {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("*" + "\t");
//
//            }
//            System.out.println();
//        }
//        return 10*8;
//    }


//    private  void method() {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("*"+"\t");
//
//            }
//            System.out.println();
//        }
//
//    }


    public int meth(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }
}
