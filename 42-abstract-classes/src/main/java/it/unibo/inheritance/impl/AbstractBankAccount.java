package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;
import it.unibo.inheritance.api.BankAccount;

public abstract class AbstractBankAccount implements BankAccount {

    private static final double ATM_TRANSACTION_FEE = 1;
    private static final double MANAGEMENT_FEE = 5;
    private static final double TRANSACTION_FEE = 0.1;

    //private final AccountHolder holder;
    private double balance;
    private int transactions;

    protected abstract boolean isWithdrawAllowed(final double amount);

    protected abstract double computeFee();

    @Override
    public void chargeManagementFees(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deposit(int id, double amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void depositFromATM(int id, double amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public AccountHolder getAccountHolder() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getBalance() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getTransactionsCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void withdraw(int id, double amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void withdrawFromATM(int id, double amount) {
        // TODO Auto-generated method stub
        
    }
    
}
