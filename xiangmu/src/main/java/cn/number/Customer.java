package cn.number;

/**
 * @author zy
 * @create 2019-11-18 14:50
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    private Account[] accounts;
    private int nmuberOfAccounts;

    public int getNmuberOfAccounts() {
        return nmuberOfAccounts;
    }

    public void setNmuberOfAccounts(int nmuberOfAccounts) {
        this.nmuberOfAccounts = nmuberOfAccounts;
    }

    public Account getAccounts(int acct_idx) {
        return accounts[acct_idx];
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
