package Day09;

public class Lixi1 {
    public static void main(String[] args) {
        Lixi1 l = new Lixi1();
        int f = l.f(10);

        System.out.println(f);

    }
    public int f(int n){

        if(n==0){
           return 1;
        }else if (n==1){
            return 4;
        }else {
           return 2*f(n-1)+f(n-2);
        }

    }
}
