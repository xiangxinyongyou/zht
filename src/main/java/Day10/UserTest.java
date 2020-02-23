package Day10;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        //User user1 = new User(6);
        System.out.println(user.age);
       // user.setAge(4);
    }

}
class User{
    int age=3;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }
}
