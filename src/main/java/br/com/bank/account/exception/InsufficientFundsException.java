package br.com.bank.account.exception;

/**
 *
 * @author gefer
 */
public class InsufficientFundsException extends RuntimeException {

    public InsufficientFundsException() {
        super("Não há saldo disponível para realizar essa operação.");
    }

}
