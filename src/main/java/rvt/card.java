package rvt;

public class card {
    private double balance;

    public card() {
        this.balance = 50;
    }

    public void balancechange(int number){
        balance = balance + number;
    }

    public double getbalance() {
        return balance;
    }
}


