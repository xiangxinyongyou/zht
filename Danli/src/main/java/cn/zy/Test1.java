package cn.zy;

/**
 * @author zy
 * @create 2019-11-17 14:21
 */
public class Test1 {


    //创建一个私有的空参的构造器
    private Test1() {
    }

    //创建一个内部类
    private static class Inner {
        //私有的静态变量
        private static  final Test1 AAA=new Test1();
    }


    public static Test1 getInstance(){
        return Inner.AAA;
    }
}
