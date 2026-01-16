package com.imt.mines;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {

    private static Person person;
    private static Bank bank;

    @BeforeClass
    public static void setup() {
        bank = new Bank();
        person = new Person("John", 'm', 30, 160.5f);
    }

    @Test
    public void testHappyPathAddAccount() {
        BankAccount account = new BankAccount(10000, 1000.0, "2024-01-01", person);
        assertEquals(1, bank.addAccount(account, 0));
    }

    @Test
    public void testHappyPathAddAccount2() {
        BankAccount account = new BankAccount(10000, 1000.0, "2024-01-01", person);
        BankAccount account2 = new BankAccount(10000, 1000.0, "2024-01-01", person);
        bank.addAccount(account, 0);
        assertEquals(2, bank.addAccount(account2, 1));
    }
    @Test
    public void testHappyPathAddAccount3() {
        BankAccount account = new BankAccount(10000, 1000.0, "2024-01-01", person);
        BankAccount account2 = new BankAccount(10000, 1000.0, "2024-01-01", person);
        BankAccount account3 = new BankAccount(10000, 1000.0, "2024-01-01", person);
        bank.addAccount(account, 0);
        bank.addAccount(account2, 1);

        assertEquals(3, bank.addAccount(account3, 2));
    }
}
