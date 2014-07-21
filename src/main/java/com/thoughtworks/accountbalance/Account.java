package com.thoughtworks.accountbalance;

/**
 * Created with IntelliJ IDEA.
 * User: Maryum
 * Date: 7/21/14
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Account {
    public int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int i) {
        balance = balance + i;

    }

    public void withdraw(int i) {
        if(i<=balance) {
            balance = balance - i;
        }
    }
}
