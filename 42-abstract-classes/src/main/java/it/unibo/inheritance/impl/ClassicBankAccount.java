package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {

    public ClassicBankAccount(AccountHolder accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public double computeFees() {
        return MANAGEMENT_FEE;
    }

    @Override
    public boolean isWithdrawAllowed(double amount) {
        return true;
    }
}

