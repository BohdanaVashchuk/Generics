package Generics;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<Account> accountList;

    public User(String userName, List<Account> accountList) {
        this.userName = userName;
        this.accountList = accountList;
    }

    public String getUserName() {
        return userName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
