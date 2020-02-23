package Test3;

public class Test1 {
    public static void main(String[] args) {
        int numb;
        numb=9;

        int [] arr=new int[5];
//        String [] arr1=new String[]{"22","ddd","ifd89"};
//        for (int i : arr) {
//
//            System.out.print(arr[i]+"\n");
//        }
//
//        System.out.println("==================");
//        for (int i = 0; i < arr1.length; i++) {
//
//            System.out.print(arr1[i]+"\n");
//        }

        String [] name=new String[5];

        name[0]="的风景";
        name[1]="的风dfds 景";
        name[2]="dsf";
        name[3]="55g";
        name[4]="gg567";
       // name[5]="的风景";
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println("该位置是"+name[3]);
        System.out.println("长度是"+name.length);
        System.out.println(name.clone());

    }
}
