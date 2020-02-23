package Test3;

public class Demeo213 {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;
            if (i>=2){
                arr[i][1]=arr[i][i-1]=8;
            }
           // arr[i][1]=arr[i][i]=11;
//            ±éÀú
            if (i>3){

            for (int j = 2; j < arr[i].length-2; j++) {
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  *");
            }
            System.out.println();
        }
    }
}
