package it.unibo.inheritance.impl;

public class ClassicBankAccount extends AbstractBankAccount {

    @Override
    protected boolean isWithdrawAllowed(double amount) {
        return getBalance() >= amount;
    }

    @Override
    protected double computeFee() {
        // TODO Auto-generated method stub
        return 0;
    }
}
