package br.com.bank.account.entities;

import br.com.bank.account.exception.InsufficientFundsException;

public class CheckingAccount implements Account {

    private double balance;
    private double transactionFee = 0.45;

    @Override
    public void toDeposit(double value) {
        this.balance += value - transactionFee;
    }

    @Override
    public void toWithdraw(double value) {
        if (value > balance) {
            throw new InsufficientFundsException();
        }
        this.balance -= value + transactionFee;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
