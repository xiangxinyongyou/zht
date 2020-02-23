package Test;


import java.util.Random;

/**
 * @author zy
 * @create 2019-10-24 17:56
 */
public class NewInstantis {
    @Test
    public void Test1() throws IllegalAccessException, InstantiationException {
        Class<Person> clazz = Person.class;
        /*
         * newInstance()创建对象的运行时类对象，内部调用了运行时类的空参构造器
         *
         * 调用此方法的要求：
         * 1.必须提供空参的构造器
         * 2.构造器的访问权限通常为public 不能是private
         * */
        Person person = clazz.newInstance();
        System.out.println(person);
    }

    /*
     * 反射的动态性
     * */
    @Test
    public void Test2() {
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int number = random.nextInt(3);
            String str = "";
            switch (number) {
                case 0:
                    str = "java.util.Date";
                    break;
                case 1:
                    str = "java.lang.Object";
                    break;
                case 2:
                    str = "Test.Person";
                    break;

            }
            try {
                Object instance = getInstance(str);
                System.out.println(instance);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

    public Object getInstance(String str) throws Exception {

        Class aClass = Class.forName(str);
        Object o = aClass.newInstance();
        return o;
    }
}
