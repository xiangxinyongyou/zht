package Test3;

public class MaoPao {
    public static void main(String[] args) {
        int [] arr =new int[]{1,23,4,567,65,39,87,634,56,-33,-91};
        //ð������  ��������
        for (int i = 0; i < arr.length-1; i++) {
            //�����Ԫ��һ����Ҫ�ȽϵĴ���
            for (int j = 0; j < arr.length-1-i; j++) {
                //�Ƚ�ǰ���������Ĵ�С(ȷ���Ǵ�С����[����],�Ӵ��С[С��])
                if(arr[j]<arr[j+1]){
                    //ǰ������������λ��
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //��һ�α�������
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
