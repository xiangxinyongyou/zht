package Day10;
public class Animal {
    String name;
    int age;
    private int lges;

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

    public int getLges() {
        return lges;
    }

    public void setLges(int lges) {
        if (lges>=0&&lges%2==0){
            this.lges = lges;
        }else {
            lges=0;
        }
    }

    public  void eat(){
        System.out.println("再吃东西");
    }
    public void show(){
        System.out.println("名字"+name+"年龄"+age+"腿的数量是"+lges);
    }
}
