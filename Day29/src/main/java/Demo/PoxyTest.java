package Demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zy
 * @create 2019-10-25 11:27
 */
interface Human {
    void sleep();

    void eat(String str);


}

class Man implements Human {


    @Override
    public void sleep() {
        System.out.println("我需要休息");
    }

    @Override
    public void eat(String str) {
        System.out.println("我喜欢吃的水果是" + str);
    }
}

/*
 * 1.如何根据加载到内部的被代理类，动态的创建一个代理类以及对象
 * 2.当通过代理类的对象调用方法时，如何动态的去调用被代理的同名的方法。
 * */
class ProxFactory {
    //获取代理的对象的静态的方法
    public static Object getInstance(Object obj) {
        //自定义的一个类实现InvocationHandler接口
        MyIncactionHander myIncactionHander = new MyIncactionHander();
        //调用自定义的类中的方法
        myIncactionHander.bagnding(obj);



        /*
         * obj.getClass().getClassLoader()： 获取和被代理类加载器一样的加载器
         *  obj.getClass().getInterfaces()：  获取和被代理类实现相同的接口
         *  myIncactionHander             ：  是一个接口   调用被代理的同名的方法。
         * */

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), myIncactionHander);

    }
}

class MyIncactionHander implements InvocationHandler {
    private Object obj;//赋值时需要被代理类进行赋值



    public void bagnding(Object obj) {
        this.obj = obj;
    }

    //重写接口的抽象方法
    // 当通过代理类的对象调用xxx方法时，就会自动的掉能用incoke() 方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //为代理类对象调用的方法   obj即为被代理的对象
        Object invoke = method.invoke(obj, args);
        return invoke;

    }
}


public class PoxyTest {
    public static void main(String[] args) {
        Man man = new Man();
//        man.eat("香蕉");
//        man.sleep();

        Object instance = ProxFactory.getInstance(man);
        //此时hu就是代理类的对象
        Human hu = (Human) instance;

        hu.eat("苹果");
        hu.sleep();
        NikeClothFactory nikeClothFactory = new NikeClothFactory();

        Object instance1 = ProxFactory.getInstance(nikeClothFactory);
        ClothFactory prox=(ClothFactory)instance1;
       prox.proctoryCloth();


    }

}
