package br.com.bank.account.entities;

public class SavingsAccount implements Account {

    private double balance;

    @Override
    public void toDeposit(double value) {
        this.balance += value;
    }

    @Override
    public void toWithdraw(double value) {
        this.balance -= value;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
