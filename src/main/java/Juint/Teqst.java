package Juint;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

public class Teqst {


    @Test
    public void ddd() {
        String s = "liumei";
        // int q=1/0;
        String as = "liumei";
        System.out.println(s.equals(as));
    }

    @Test
    public void ss() {
        int i = 99;
        Integer integer = new Integer(i);
        String s = integer.toString();
        System.out.println(s);
    }

    @Test
    public void aa() {
        String s1 = new String("123");

        Integer integer = new Integer(s1);
        int i = integer.intValue();
        System.out.println(i);
        System.out.println("比较" + (i == 123));
        System.out.println("=============");
        System.out.println(integer);
        System.out.println("====" + integer.toString().equals("123"));
        String s = integer.toString();
        System.out.println(s);
    }

    @Test
    public void qq() {
        char w = 'q';
        Character character = new Character(w);
        String s = character.toString();
        System.out.println(character);
        System.out.println(s);

        System.out.println("===================");
        String n = "name";
        int a = 9;
        String k = 9 + "";
        System.out.println("我是字符串:" + (k == "9") + "\t" + k);
        String s1 = String.valueOf(a);
        System.out.println("-------");
        System.out.println(s1);

    }



    @Test
    public void stringtoInterget(){
        String  str="123";
        int i = Integer.parseInt(str);
        System.out.println(i);
        String str1="false";
        boolean b = Boolean.parseBoolean(str1);
        System.out.println(b);
    }
}
