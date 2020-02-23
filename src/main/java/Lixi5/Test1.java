package Lixi5;

import org.junit.Test;

public class Test1 {
    @Test
    /*
     * 考察的是在编译的时候int类型和duoble需要进行类型的提示，全部提升为duoble  然后在运算
     * 三元运算要考虑类型
     * */
    public void demo() {
//        float v = new Float(22f);
        Integer integer = new Integer(1);

        Boolean aTrue = new Boolean("true");
        Boolean aBoolean = new Boolean(true);
        Float aFloat = new Float(33f);
        Character a = new Character('A');
        byte b = 33;
        short d = 99;

        Object o1 = true ? new Integer(4) : new Boolean("true");//4
        Object o2 = true ? new Integer(4) : new Character('A');//4
        Object o3 = true ? new Integer(4) : new Float(33f);//4.0
        Object o4 = true ? new Integer(4) : new Double(2.6);//4.0
        Object o5 = true ? new Integer(4) : new Byte(b);//4
        Object o6 = true ? new Integer(4) : new Short(d);//4

    }

    @Test
    /*
    * if判断不需要考虑类型的提升
    *
    * */
    public void demo2() {
        Object o2;
        if (true) {
            o2 = new Integer(2);
        } else {
            o2 = new Double(333.4);
        }
        System.out.println(o2);//2
    }


    @Test
    public void demo3(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i==j);//false   new 的需要比较两个的地址值
        Integer m=1;
        Integer n=1;
        System.out.println(m==n);//true  用到了拆箱  指向了同一个值，所以相等
        Integer x=128;
        Integer y=128;
        System.out.println(x==y);//false  范围是-128到127  128数组中没有需要new
        System.out.println("33333");

    }

    public static void main(String[] args) {
        System.out.println("Test1.main");

    }
}
