package Day08;
/*
 *javac
 *
 * */

public class Test {
    public static void main(String[] args) {
        System.out.println("你好好");
        Person person = new Person();
        person.age=18;
        person.sex=1;
        person.name="dff";
      person.study();
        person.showAge();
        int i = person.addShowAge(2);
    }
}
