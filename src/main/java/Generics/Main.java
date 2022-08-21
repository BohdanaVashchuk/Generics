package Generics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        UserService userService = new UserService();
        Account account = new DebitAccount("1", 2223.34);
        Account account1 = new DebitAccount("2", 2224.34);
        Account accountCredit = new CreditAccount(3, 2224.34);
        List<Account> accountList = new ArrayList<>();
        accountList.add(account);
        accountList.add(account1);
        accountList.add(accountCredit);
        User user = new User("Dana", accountList);

        Account accountD = new DebitAccount("4", 2223.34);
        Account accountDA = new DebitAccount("5", 2224.34);
        Account accountCredit1 = new CreditAccount(6, 2224.34);
        List<Account> accountListUser1 = new ArrayList<>();
        accountListUser1.add(accountD);
        accountListUser1.add(accountDA);
        accountListUser1.add(accountCredit1);
        User user1 = new User("Anna", accountListUser1);

        users.add(user1);
        users.add(user);

        userService.printAllUsers(users);
        userService.printAllAccounts(users);

        LOGGER.info("Total tax for account" + userService.printTax(user1));
    }
}
