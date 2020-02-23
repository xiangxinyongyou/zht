package Lixi2;


public class Customer {
    private String firstName;
    private  String LastName;
    private  Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
