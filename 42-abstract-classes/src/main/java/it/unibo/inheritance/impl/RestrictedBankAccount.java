package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class RestrictedBankAccount extends AbstractBankAccount {

    private static final double TRANSACTION_FEE = 0.1;

    public RestrictedBankAccount(AccountHolder accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public double computeFees() {
        return MANAGEMENT_FEE + getTransactionsCount() *TRANSACTION_FEE;
    }

    @Override
    public boolean isWithdrawAllowed(double amount) {
        return amount <= getBalance();
    }
    
}
