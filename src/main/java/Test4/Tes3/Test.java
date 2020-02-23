package Test4.Tes3;

public class Test {
    static int i ;


    public static String lengtmh(String str, int length) {

        String nestr = str;

        if (str.length() < length) {
            nestr = "0" + str;

            return lengtmh(nestr, length);

            //  return lengtmh("0" + str, length);
        } else {
            return nestr;

        }
        // return nestr;
    }

    public static void main(String[] args) {
        for (int i1 = 0; i1 < 1000; i1++) {
            String s = i + "";

            i++;
            System.out.println("sadfghjfdghfdsfedghgdsfhjg"+Test.lengtmh(s, 4));
        }

    }
}
