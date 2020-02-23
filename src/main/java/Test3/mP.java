package Test3;

public class mP {
    public static void main(String[] args) {
        mP pr = new mP();
        int[] arr = new int[]{14, 22, 77, 11, -44, -79, 2, 788, 62, -55};
        System.out.print("排序之前: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
                   pr.swap(arr,j,j+1);
                }
            }
        }
        System.out.println("\n"+"==============="+"\n");
        System.out.print("排序之后: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }

}
