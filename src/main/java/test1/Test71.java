package test1;

public class Test71 {
    public static void main(String[] args) {
        long str = System.currentTimeMillis();
        int coun=0;
      ll:  for (int i = 2; i <= 100000; i++) {

            for (int j =2; j <=Math.sqrt(i); j++) {
                if (i%j==0){
                    continue ll;
                }
            }
         // System.out.println(i);
          coun++;
        }
        System.out.println(coun);
        long end = System.currentTimeMillis();
        System.out.println(end-str);
    }
}
