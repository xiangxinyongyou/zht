package Day09;

public class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int max = test1.Max(93, 9,66);
        System.out.println(max);
   //     test1.show("eeesfs");
       test1.show("s","ee","sdfds","erer");
       //test1.show();

    }

    public int Max(int a,int b,int c){
        int m=(a>b)?a:b;
        int d=(m>c)? m:c;
        return d;
    }
//    public void show(String s){
//        System.out.println("水电费拉速度快");
//    }
    public  void  show(String ... strs){
       // System.out.println("你好哦！！！！====");
        for (int i = 0; i < strs.length; i++) {
            if (i==0){

                System.out.print("["+strs[i]+",");

            }
            if (i>0&&i<strs.length-1){

                System.out.print(strs[i]+",");
            }
            if (i==strs.length-1) {
                System.out.print(strs[strs.length-1]+"]");
            }
          //  System.out.print(strs[i].toString());
        }
    }


}
