package Test3;

public class Demo7 {
    public static void main(String[] args) {

        String[] arr=new String[]{"AA","BB","DD","MM","QC","CN"};
Boolean isFlag=true;
        String dest="CN2";
        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])){
                System.out.println("找到了位置在"+i);
                isFlag=false;
                break;
            }
        }
        if (isFlag==true){
            System.out.println("不存在");
        }
    }
}
