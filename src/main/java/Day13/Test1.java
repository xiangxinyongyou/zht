package Day13;

import java.util.EventListener;

public class Test1 {
    public void method(Person e) {

if (e instanceof Graduate){
    System.out.println("P");
    System.out.println("S");
    System.out.println("a1 Graduate");
}else if (e instanceof Student){
    System.out.println("a person");
    System.out.println("a 2Student");
}else {
    System.out.println("a 3Person");
}

    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();

        System.out.println("==============");
        Person p2 = new Graduate();
        test1.method(p2);
        Person p1 = new Student();
        test1.method(p1);
        Person person = new Person();
        test1.method(person);
    }
}
