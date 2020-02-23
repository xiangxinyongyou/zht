package cn.zy;

import org.junit.Test;

import java.util.*;

/**
 * @author zy
 * @create 2019-11-09 15:34
 */
public class Test1 {

    @Test
    public void Test01() {
        Collection col = new ArrayList();
        col.add(123);
        col.add(543);
        col.add("hello");
        Person p = new Person("tome", 33);
        col.add(p);
        col.add(true);
        System.out.println(col);

        col.remove(123);  //这个remove()和迭代器的remove()是不一样的
        System.out.println(col);
        //删除集合中的Tome
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            //  iterator.remove();  //java.lang.IllegalStateException(非法语句异常)
            //在调用next()方法之前不能调用remove方法否则会报错
            Object obj = iterator.next();
            if (p.equals(obj)) {
                iterator.remove();
                // iterator.remove();    //已经调用了remove()方法之后又调用了remove()也会报非法语句异常
            }
        }
        System.out.println("=====================");
        //遍历集合
        iterator = col.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void Test2() {
        String[] arr = new String[]{"KK", "KK", "KK"};
//        for (String s : arr) {
//            s="ff";
//            System.out.println(s);  //增强for是把对象赋值给s   再次遍历数组还是之前数组的内容
        //打印s  才是赋值后的集合内容
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "pp";
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    @Test
    public void Test3() {
        //考察remove()删除的是对象还是索引
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        // System.out.println(list);//1,2
        System.out.println(list);

    }

    private void updateList(List list) {
        // list.remove(2);//删除的是索引2而不是数字2
        list.remove(new Integer(2));
    }

    @Test
    public void Test4() {
        /*
         * 去掉集合中重复的元素*/
        List arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(44);
        arrayList.add(55);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(88);
        List list = updatest(arrayList);
        for (Object o : list) {

            System.out.println(o);
        }
    }

    private static List updatest(List arrayLIST) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayLIST);   //将集合中重复的元素去掉，先将集合放到set中，在遍历
//       hashSet.add(arrayLIST);
        System.out.println(hashSet);
        return new ArrayList(hashSet);
    }

    @Test
    public void Test5() {
        /*
        * 保存到set中的内容比较的是先比较hash()值在比较equals()*/
        Set set = new HashSet();
        Person p1 = new Person("xq", 11);
        Person p2 = new Person("xx", 22);
        set.add(p1);
        set.add(p2);
        p1.name = "ss";  //
        set.remove(p1);  //现在P1指向是 “ss”,11  但是它对应的hash值 不是P1的位置是个空值
        System.out.println(set+"-----"); //xx ss
        set.add(new Person("ss",11));//此时添加的ss ,11就是上面删除的P1的位置
        System.out.println(set+"----====="); //ss，xx, ss
        set.add(new Person("xq",11));//此时添加的还是P1对应的Hash 值 但是内容不一样
                                                //就会以链表的形式添加到下面 xq,11
        System.out.println(set);// ss,xx,ss,xq
        set.add(p1);//  此时添加的P1是修改成  ss,11 的内容 他的hash值和equals都是相同的就只能保存一个
        System.out.println(set);//

    }
    @Test
    public void Test6(){
        ArrayList list = new ArrayList();
        list.add(23);
        list.add(43);
        list.add(6226);
        list.add(55);
        list.add(-12);
        System.out.println(list);
       // ArrayList dest = new ArrayList();
        System.out.println("===============");

        List dest = Arrays.asList(new Object[list.size()]);

       Collections.copy(dest,list);
         Collections.shuffle(dest);
        Collections.sort(dest);
        Object max = Collections.max(dest);
        System.out.println(max);
        System.out.println(dest);

    }
}
