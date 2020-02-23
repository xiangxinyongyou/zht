package Test3;

public class MaoPao {
    public static void main(String[] args) {
        int [] arr =new int[]{1,23,4,567,65,39,87,634,56,-33,-91};
        //冒泡排序  遍历数组
        for (int i = 0; i < arr.length-1; i++) {
            //数组的元素一共需要比较的次数
            for (int j = 0; j < arr.length-1-i; j++) {
                //比较前后两个数的大小(确定是从小到大[大于],从大道小[小于])
                if(arr[j]<arr[j+1]){
                    //前后两个数交换位置
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //在一次遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
