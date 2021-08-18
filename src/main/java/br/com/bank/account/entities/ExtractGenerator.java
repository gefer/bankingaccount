package br.com.bank.account.entities;

import javax.swing.JOptionPane;

public class ExtractGenerator {

    public void generate(Account account) {
        JOptionPane.showMessageDialog(null, "O Saldo da Conta " + (account instanceof CheckingAccount ? "Corrente" : "Poupança") + " é: " + account.getBalance());
    }
}
