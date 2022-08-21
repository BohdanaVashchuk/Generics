package Generics;

public class Account<T> {
    private T id;
    private Double sum;

    public Account(T id, Double sum) {
        this.id = id;
        this.sum = sum;
    }

    public void setId(T id) {
        this.id = id;
    }
    public T getId() {
        return id;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }
}
