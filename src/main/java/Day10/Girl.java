package Day10;

public class Girl {
    private  String name;
    private  int age;

    public Girl() {
        System.out.println("今年芳龄"+age);
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
    public void marry (Boy boy){
        boy.marry(this);
        System.out.println("我要嫁给"+boy.getName());

    }
    public void  compare(Girl girl){

    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        Girl g = new Girl("祝英台", 22);
        g.marry(boy);
    }
}
