package Day08;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Person {
    String name;
    int age=9;
    int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    public  void showAge() {
        System.out.println(age);

    }


    public   int addShowAge(int a) {
        age+=a;
        System.out.println(age);
        return age;
    }



    public  void study() {
        System.out.println("studing");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.showAge();
        p1.study();

    }
}
