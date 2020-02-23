package test1;

public class Test7 {
    //你好
    public static void main(String[] args) {
        boolean aa=true;
        for (int i = 2; i <= 100; i++) {

            for (int j =2; j < i; j++) {
                if (i%j==0){

                  aa=false;
                   System.out.println("我是非质数"+i);
                }
            }
            if (aa==true){
               System.out.println("质数是"+i);
            }
            aa=true;
        }
    }
}
