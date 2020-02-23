package Day11;

public class Customer {
    private String name;//客户姓名
    private char gender;// ：性别
    private int age;//         ：年龄
    private String phone;//电话号码
    private String email;//电子邮箱


public String info(){
  String s=name+"\t\t"+gender+"\t\t"+age+"\t"+phone+"\t\t\t"+email;
    System.out.println();
    return s;
}
    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public static void main(String[] args) {
////        Customer customer = new Customer();
////        customer.setAge(999);
////        int age = customer.getAge();
////        System.out.println(age);
////    }
}
