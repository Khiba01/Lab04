package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount {

    private static final double TRANSACTION_FEE = 0.1;

    public ExtendedStrictBankAccount(int id, double balance) {
        super(id, balance);
    }

    public boolean checkId(int id) {
        return getid() == id;
    }

    public void transactionOp(final int id, final double amount) {
        if (checkId(id)) {
            setBalance(getBalance() + amount);
            incrementTransactions();
        }
    }
    
    public boolean isWithdrawAllowed(final double amount) {
        return amount <= getBalance();
    }
    
    public void deposit(final int id, final double amount) {
        transactionOp(id, amount);
    }

     public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            transactionOp(id, -amount);   
        }
    }

    public void depositFromATM(final int id, final double amount) {
        transactionOp(id, amount - ATM_TRANSACTION_FEE);
    }

    public void withdrawFromATM(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            transactionOp(id, amount + ATM_TRANSACTION_FEE);   
        }
    }

    public void chargeManagementFees(final int id) {
        final double feeAmount = MANAGEMENT_FEE + getTransactionsCount() * TRANSACTION_FEE;
        if (checkUser(id) && isWithdrawAllowed(feeAmount)) {
            setBalance(getBalance() - feeAmount);
            resetTransactions();
        }
    }
}
