package Test3;

public class Demo5 {
    public static void main(String[] args) {
        int[] arr1 =new int[]{2,3,5,7,11,13,17,19};

        System.out.println(arr1.length);
        System.out.println( arr1.length-1);

        int[] arr2 =new int[8];
        arr2=arr1;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");

        }
        System.out.println();
        System.out.println("==============");
        for (int i = 0; i < arr2.length; i++) {
            if (i%2==0){
                arr2[i]=i;
            }
            System.out.print(arr2[i]+"\t");
        }


    }
}
