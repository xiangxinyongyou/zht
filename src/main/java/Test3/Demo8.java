package Test3;

public class Demo8 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 6, 8, 9, 11, 13, 15, 16, 18, 19};
//        System.out.println(arr.length);
//        System.out.println(arr.length-1);
        int a = 179;
        int star = 0;
        int end = arr.length - 1;
        boolean isFlage=true;
        //二叉算法查找指定的数字,  要求必须保证是有序的排列的
        while (star <= end) {
            int mide = (star + end) / 2;

                if (a == arr[mide]) {
                    System.out.println("数字的位置是: "+mide);
                    isFlage=false;
                    break;
                } else if (arr[mide] > a) {
                    end = mide - 1;
                } else {
                    star = mide + 1;
                }

        }
        if (isFlage){
            System.out.println("没有找到,和遗憾");
        }

    }
}
