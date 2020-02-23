package Test3;

import java.util.Arrays;

public class GongJu {
    /*
    * 操作数组的工具类
    * */
    public static void main(String[] args) {
        int [] arr =new int[]{1,-62,3,24,8,0};
        int [] arr1 =new int[]{1,3,2,4};
        int [] arr11 =new int[]{1,2,3,4};
        int [] arr3 =new int[6];
        arr3=arr;
        boolean equals = Arrays.equals(arr, arr3);
        System.out.println(equals);
        System.out.println(Arrays.toString(arr3));
       // Arrays.fill(arr,33);
        System.out.println("替换后"+Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println("排序后"+Arrays.toString(arr));

        int[] arr6 = new int[]{3, 5, 6, 8, 9, 11, 13, 15, 16, 18, 19};
        int index = Arrays.binarySearch(arr6, -77);
//        if (index>0){
            System.out.println("索引的位置"+index);

//        }




    }
}
