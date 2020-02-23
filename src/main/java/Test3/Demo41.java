package Test3;
import java.util.Scanner;

public class Demo41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入打印回形的数字");
        int len = scanner.nextInt();

        int[][] arr = new int[len][len];
        int s = len * len;
        int k = 1;
        int i = 0;
        int j = 0;
        for (int m = 1; m <=s; m++) {
            if (k == 1) {
                if (j < len && arr[i][j] == 0) {
                    arr[i][j++] = m;
                } else {
                    k = 2;
                    i++;
                    j--;
                    m--;
                }

            } else if (k == 2) {
                if (i< len && arr[i][j] == 0) {
                    arr[i++][j] = m;
                } else {
                    k = 3;
                    i--;
                    j--;
                    m--;
                }
            }else if (k == 3) {
                if (j>=0 && arr[i][j] == 0) {
                    arr[i][j--] = m;
                } else {
                    k = 4;
                    i--;
                    j++;
                    m--;
                }
            }else if (k == 4) {
                if (i>=0 && arr[i][j] == 0) {
                    arr[i--][j] = m;
                } else {
                    k = 1;
                    i++;
                    j++;
                    m--;
                }
            }

        }
        for (int h = 0;h < arr.length;h++) {
            for (int n = 0; n < arr[h].length; n++) {
              int e=  arr[h][n];
                System.out.print(e+"\t");
            }
            System.out.println();
        }

    }
}
