package Day12Exent;

public class Person {
    String name;
   private int age;

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
    private void eat(){
        System.out.println("re吃");
        System.out.println("good");

    }
    public void sleep(){
        System.out.println("人睡");
        eat();
    }
}
