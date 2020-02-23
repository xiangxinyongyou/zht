package Test3;

public class Test4 {
    public static void main(String[] args) {
        int[] ints = new int[4];
        String[][] arr2 = new String[4][5];

        //二维数组的遍历
        int[] arr1[]  = new int[][]{{1, 2, 3}, {3, 66,44,88,66}, {5, 7, 23}};
        System.out.println("二维数组的长度: "+arr1.length);
        System.out.println("二维数组中指定一维数组的长度: "+arr1[1].length);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr1[i].length; j++) {
                //遍历二维数组
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();

        }
    }
}
