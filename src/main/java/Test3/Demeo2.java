package Test3;

public class Demeo2 {
    public static void main(String[] args) {
        //1.定义一个二维数组(动态的)
        int[][] yanghui = new int[10][];
        //2.给数组的元素赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            //给首末位置赋值
            yanghui[i][0] = yanghui[i][i] = 1;
            //给非首末位置赋值,遍历内部数组排除第一个和最后一个
           // if(i>1){   可以不写
                for (int j = 1; j < yanghui[i].length - 1; j++) {
                    //定义规律
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
                }
          //  }

        }
        //3.遍历二维数组
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
