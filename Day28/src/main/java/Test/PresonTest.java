package Test;


import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author zy
 * @create 2019-10-24 15:00
 */
public class PresonTest {
    @Test
    //反射前
    public void Test1() {
        Person person = new Person();
        person.setAge(33);
        int age = person.getAge();
        System.out.println(age);
        person.show();

    }

    @Test
//    反射
    public void Test2() throws Exception {
        //1.获取Class的对象
        Class ck = Person.class;
        //获取有参构造器
        Constructor constructor = ck.getConstructor(int.class, String.class);
        //通过构造器获取对象
        Person obj = (Person) constructor.newInstance(33, "tome");
        System.out.println(obj.toString());
    /*  空参构造器
      Constructor constructor = ck.getConstructor();
        Person o = (Person)constructor.newInstance();
        o.setAge(22);
        o.setName("lixia");
        System.out.println(o.toString());*/

        //通过反射调用公共的属性和方法
        Field age = ck.getDeclaredField("age");
        age.set(obj, 88);
        System.out.println(obj);
        Method show = ck.getDeclaredMethod("show");
        show.invoke(obj);

        //调用私有的属性和方法以及构造器
        //getDeclaredConstructor（）调用构造器
        Constructor c1 = ck.getDeclaredConstructor(String.class);
        c1.setAccessible(true);
        Person p1 = (Person) c1.newInstance("成龙");
        System.out.println(p1);
        //调用私有的属性
        Field name = ck.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj, "日本人");
        System.out.println(obj.toString());
        //调用私有的方法
        Method showNation = ck.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        Object na = showNation.invoke(p1, "中国");
        System.out.println(na);
        String s = (String) na;
        System.out.println(s);
    }

    @Test
    //获取Class实例的方式
    public void Test3() throws ClassNotFoundException {
        //方式一
        Class aClass1 = Person.class;
        System.out.println("我是第一个："+aClass1);
        //方式二
        Person person = new Person();
        Class aClass2 = person.getClass();
        System.out.println("我是第二个："+aClass2);
       // System.out.println(person.getClass());
        //方式三
        Class aClass3 = Class.forName("Test.Person");
        System.out.println("我是第三个："+aClass3);
        //方式四   使用类的加载器  ClassLoader
        //PresonTest.class是自定义的类名
        //获取类的加载器
        ClassLoader classLoader = PresonTest.class.getClassLoader();
        //显示加载的类
        Class aClass4 = classLoader.loadClass("Test.Person");
        System.out.println("我是第四个："+aClass4);

        System.out.println(aClass1==aClass2);
        System.out.println(aClass3==aClass2);
        System.out.println(aClass4==aClass1);
    }


}
