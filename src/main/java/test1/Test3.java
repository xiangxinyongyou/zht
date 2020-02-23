package test1;

public class Test3 {
    public static void main(String[] args) {

        for (int i = 100; i <= 999; i++) {
            int b = i/100;
            int s = i%100/10;
            int g = i%10;
         if (i==b*b*b+s*s*s+g*g*g){
             System.out.println(i);
         }
        }
    }
}
