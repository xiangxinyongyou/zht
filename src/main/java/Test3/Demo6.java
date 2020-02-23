package Test3;

public class Demo6 {
    public static void main(String[] args) {
        int []  arr=new int[]{4,6,88,33,8};
        for (int i = 0; i < arr.length/2; i++) {
            int m=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=m;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
