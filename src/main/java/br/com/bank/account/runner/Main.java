package br.com.bank.account.runner;

import br.com.bank.account.entities.CheckingAccount;
import br.com.bank.account.entities.ExtractGenerator;
import br.com.bank.account.entities.SavingsAccount;

public class Main {

    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.toDeposit(1200.20);
        checkingAccount.toWithdraw(8000);

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.toDeposit(500.50);
        savingsAccount.toWithdraw(25);

        ExtractGenerator extractGenerator = new ExtractGenerator();
        extractGenerator.generate(checkingAccount);
        extractGenerator.generate(savingsAccount);
    }
}
