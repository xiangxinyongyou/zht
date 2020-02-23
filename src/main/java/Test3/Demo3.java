package Test3;

public class Demo3 {
    public static void main(String[] args) {

//        生成随机的6个数,并且保证不重复
   int [] arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*30+1);
            for (int j = 0; j < i; j++) {
                if (arr[i]==arr[j]){
                    i--;
                    break;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
