package cn.zy;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * @author zy
 * @create 2019-11-15 13:35
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        List list = new ArrayList();
        Set set = new HashSet();
        System.out.println("输入数字");
        for (int i = 0; i < 5; i++) {
            num = scanner.nextInt();
            set.add(num);
            // list.add(num);

        }
        System.out.println("set输出的" + set);
        System.out.println("===================");
        for (Object o : set) {
            System.out.println(o);
            list.add(o);
        }
        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.reverse(list);
//
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }

        });
        System.out.println(list);
    }

    @Test
    public void demo1() {
        Random random = new Random();
        List list = new ArrayList();
        Set set = new HashSet();
        int num;
        for (int i = 0; i < 10; i++) {

            num = random.nextInt(99 - 1 + 1);
            System.out.println(num);
            set.add(num);
//           list.add(num);
        }
        list.add(set);
        System.out.println(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }

        });
        System.out.println(list);
    }

    @Test
    public void demo2() {

//        set= new HashSet();
        List set = new ArrayList();

        set.add(3);
        set.add(55);
        set.add(88);
        set.add(55);
        set.add(255);
        set.add(575);
        System.out.println(set);
        for (int i = 0; i < set.size(); i++) {
            System.out.println(set.get(i));
        }
    }


}
