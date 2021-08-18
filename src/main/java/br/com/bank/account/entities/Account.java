package br.com.bank.account.entities;

public interface Account {

    void toDeposit(double valor);

    void toWithdraw(double valor);

    double getBalance();

}
