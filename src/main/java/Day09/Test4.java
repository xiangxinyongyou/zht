package Day09;

public class Test4 {
    public static void main(String[] args) {
        double [] arr=new double[]{12,3,34,56,77,432};
//        double temp=arr[0];
//        for (int i = 0; i < arr.length; i++) {
//           arr[i]/=temp;
//            System.out.println(arr[i]);
//        }
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i]=arr[i]/arr[0];
           // System.out.println(arr[i]);
        }
        char [] arrn=new char[]{'3','s','d'};


            System.out.println(arrn);

       int [] m= new int[]{1,4,5};
        for (int i = 0; i < m.length; i++) {

            System.out.println(m[i]);
        }
    }
}
