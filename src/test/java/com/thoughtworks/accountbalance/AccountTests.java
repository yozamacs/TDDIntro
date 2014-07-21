package com.thoughtworks.accountbalance;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;



public class AccountTests {

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account myAccount = new Account(100);
        myAccount.deposit(50);
        assertThat(myAccount.balance, is(150));
    }


    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account myAccount = new Account(100);
        myAccount.withdraw(50);
        assertThat(myAccount.balance, is(50));
   }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account myAccount = new Account(50);
        myAccount.withdraw(100);
        assertThat(myAccount.balance, is(50));
    }
}
