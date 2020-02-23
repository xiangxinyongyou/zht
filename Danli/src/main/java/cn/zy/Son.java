package cn.zy;

/**
 * @author zy
 * @create 2019-11-17 14:51
 */
public class Son extends Father {
    private int i = test();
    private static int j = method();

    static {
        System.out.print("(6)");
    }

    public Son() {
        System.out.print("(7)");

    }

    {
        System.out.print("(8)");
    }

    public int test() {
        System.out.print("(9)");
        return 1;
    }

    public static int method() {
        System.out.print("(10)");
        return 1;
    }

    public static void main(String[] args) {

        /*
        * 类的初始化  ========>类变量显示赋值代码和静态代码块代码  从上到下按顺序执行
        *     一个类要创建需要先加载并初始化该类
        *         main方法所在的类需要先加载和初始化
        *    一个子类初始化要先初始化父类
        *    一个类初始化就是执行<clinit>()方法
        *         <clinit>()方法由静态的类变量显示赋值代码和静态代码块组成
        *              类变量显示赋值代码和静态代码块代码  从上到下按顺序执行
        *              <clinit>()方法只执行一次
         * 实例的初始化  ===========>非静态实例变量显示赋值代码和非静态代码块代码从上到下按顺序执行，构造器最后执行
         *    就是执行<init>()方法
         *          <init>()方法可能重载有多个，有几个构造器就有几个<init>()
         *          <init>()方法由非静态实例变量显示赋值代码和非静态代码块、对应的构造器代码组成
         *          非静态实例变量显示赋值代码和非静态代码块代码从上到下按顺序执行，构造器最后执行
         *          每次创建实例对象，调用对应的构造器，执行的就是对应的<init>()方法
         *          <init>()方法的首行是super（）或super(实参列表)，对应父类的<init>()方法
         * (注意：非静态方法的前面其实有一个默认的对象this  this在构造器他表示的是
         * 正在创建的对象，如果是创建子类，就执行子类重写父类的方法（面向对象的多态性）)
         *
        * 方法的重写  Overrride  =======>
        *  1.哪些方法不可以重写
        *    final方法
        *    静态方法
        *    private子类中不可见方法
        * 2.对象的多态性
        *    子类如果重写父类的方法，通过子类对象调用的一定是子类重写过的代码
        *    非静态方法默认的调用对象是this
        *    this对象在构造器或者说<init>方法中就是正在创建的对象
        * */
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();


    }
}
