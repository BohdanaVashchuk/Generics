package Generics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserService<T extends Account, User> {
    public static final Logger LOGGER = LogManager.getLogger(UserService.class);

    public void printAllUsers(List<Generics.User> users) {
        List<String> names = new ArrayList<>();
        for (Generics.User user : users) {
            names.add(user.getUserName() );
        }
        Collections.sort(names);
        for (String name : names) {
            LOGGER.info(name);
        }
    }

    public void printAllAccounts(List<Generics.User> users) {
        LOGGER.info("All accounts");
        for (Generics.User user : users) {
            List<Account> accounts = user.getAccountList();
            for (Generics.Account account : accounts){
                LOGGER.info(account);
            }
        }
    }

    public Double printTax(Generics.User user) {
        Double totalSum = 0.0;
        Double tax;
        for (Account account:  user.getAccountList()) {
            totalSum = totalSum + account.getSum();
        }
        tax = totalSum*0.05;
        return tax;
    }
}
