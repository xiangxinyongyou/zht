package Day10;

import javax.xml.transform.Source;

public class PersonTest {
    public static void main(String[] args) {
       // Person b = new Person();
      //  b.age=9;
       // b.setAge(44);
       // int age = b.getAge();
       // System.out.println("年龄为："+age);
        Person d = new Person(33, "liss");

        System.out.println(d.getAge()+d.getName());
    }
}
