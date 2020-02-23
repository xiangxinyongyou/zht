package Test4;

public class Test1 {
    public static void main(String[] args) {

        int [] arr =new int[]{34,5,22,-98,6,-76,0,-3};

        int [] arr1= new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr[i];
        }
        System.out.println("复制");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(+arr1[i]+"\t");

        }
        System.out.println();
        //反转
        for (int i = 0; i < Math.sqrt(arr.length); i++) {

                int temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //冒泡
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j]>arr[j+1]){
//                    int temp =arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+"\t");
//        }

    }
}
