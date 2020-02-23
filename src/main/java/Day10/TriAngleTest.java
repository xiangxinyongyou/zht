package Day10;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TriAngleTest {
//   public  double are(){
//       TriAngle triAngle = new TriAngle(3, 6);
//       double are=triAngle.getBase()*triAngle.getHeight()/2;
//       return are;
//   }

    public static void main(String[] args) {
//        TriAngleTest triAngleTest = new TriAngleTest();
//        double are = triAngleTest.are();
//        System.out.println(are);
        TriAngle triAngle = new TriAngle(4,8);
        double are=triAngle.getBase()*triAngle.getHeight()/2;
        System.out.println(are);
    }
}
