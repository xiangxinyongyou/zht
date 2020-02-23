package test1;

public class Test2 {
    public static void main(String[] args) {
//        int sum =0;
//        for (int i = 1; i <= 100; i++) {
//            if (i%2!=0){
//               sum+=i;
//            }
//        }
//        System.out.println(sum);
        int count =0;
        int sum =0;
        for (int i = 1; i <=100; i++) {
            if (i%7==0){
                count++;
                sum+=i;
            }
        }
        System.out.println("7的整数的个数是:"+count);
        System.out.println("求和"+sum);
    }
}
