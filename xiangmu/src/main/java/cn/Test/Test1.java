package cn.Test;

/**
 * @author zy
 * @create 2019-11-22 11:14
 */
public class Test1 {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = null;
        //如果不加非空条件的判断，当比较两个空的话会报空指针异常，程序没有办法进行下去
       // 加上了就算有错误程序任然可以继续往下走
        if (str1 != null && str2 != null && str1.equals(str2)) {
            System.out.println(true);
        } else if (str2 == null || str2 == " ") {
            System.out.println(false);
        } else {
            System.out.println("============");
        }
    }
}
