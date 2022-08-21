package Generics;

public class DebitAccount extends Account<String>{
    public DebitAccount(String id, Double sum) {
        super(id, sum);
    }
}
