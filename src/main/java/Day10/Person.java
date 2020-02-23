package Day10;

import java.rmi.Naming;

public class Person {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        //this();
        this(name);
        this.age = age;
        this.name = name;
    }

    public Person() {

        this.age = 18;
        System.out.println("好好学习，天天向上");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 130) {

            this.age = age;
        } else {
            this.age = -1;
        }
    }
}
