package Day10;

public class Boy {
    private  String name="tome";
    private  int age;

    public Boy() {
        System.out.println("nihao ");
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
    public  void marry(Girl girl){
        System.out.println("我要取"+girl.getName());

    }
    public  void  shout(){

    }
}
