package com.imt.mines;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    private static Person person;

    @BeforeClass
    public static void setup() {
        person = new Person("John", 'm', 30, 160.5f);
    }

    @Test
    public void testHappyPathDeposit() {
        BankAccount account = new BankAccount(10000, 1000.0, "2024-01-01", person);
        account.depositMoney(100);
        assertEquals(10100, account.getBalance(), 0.001);
    }

    @Test
    public void testEdgeCaseDeposit() {
        BankAccount account = new BankAccount(10000, 1000.0, "2024-01-01", person);
        account.depositMoney(-100); 
        assertEquals(10000, account.getBalance(), 0.001);
    }

    @Test
    public void testHappyPathWithdraw() {
        BankAccount account = new BankAccount(10000, 1000.0, "2024-01-01", person);
        boolean result = account.withdrawMoney(500);
        assertTrue(result);
        assertEquals(9500, account.getBalance(), 0.001);
    }
    @Test
    public void testEdgeCaseWithdraw_ExceedingBalance() {
        BankAccount account = new BankAccount(10000, 1000.0, "2024-01-01", person);
        boolean result = account.withdrawMoney(1500); 
        assertFalse(result);
        assertEquals(10000, account.getBalance(), 0.001);
    }
}
