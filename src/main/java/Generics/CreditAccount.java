package Generics;

public class CreditAccount extends Account<Integer>{
    public CreditAccount(Integer id, Double sum) {
        super(id, sum);
    }
}
