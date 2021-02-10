package com.gof.structural.bridge.wikipedia;

// Implementor
class SimpleAccount extends AbstractAccount {
    private int balance;

    public SimpleAccount(int balance) {
        this.balance = balance;
    }

    public boolean isBalanceLow() {
        return balance < 50;
    }

    public void withdraw(int amount) {
        boolean shouldPerform = balance >= amount;
        if (shouldPerform) {
            balance -= amount;
        }
        operate("withdraw " + amount, shouldPerform);
    }
}
