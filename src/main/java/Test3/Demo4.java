package Test3;


import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[][] arr = new int[len][len];
        int s = len * len;
        int k = 1;

        int i = 0;
        int j = 0;
        for (int m = 1; m <= s; m++) {
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
                if (i < len && arr[i][j] == 0) {
                    arr[i++][j] = m;
                } else {
                    k = 3;
                    i--;
                    j--;
                    m--;
                }
            } else if (k == 3) {
                if (j >= 0 && arr[i][j] == 0) {
                    arr[i][j--] = m;
                } else {
                    k = 4;
                    i--;
                    j++;
                    m--;
                }
            } else if (k == 4) {
                if (i >= 0 && arr[i][j] == 0) {
                    arr[i--][j] = m;
                } else {
                    k = 1;
                    i++;
                    j++;
                    m--;
                }
            }
        }
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                System.out.print(arr[m][n]+"\t");
            }
            System.out.println();
        }
    }

}
