/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package coreJava.concurrency.unsynch;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author catherine
 * @version $Id: Bank.java, v 0.1 2019年05月01日 14:11 catherine Exp $
 */
public class Bank {

    private final double[] accounts;
    private       Lock     bankLock = new ReentrantLock();

    public Bank(int n,double initialBalance){
        accounts = new double[n];
        Arrays.fill(accounts,initialBalance);
    }

    public void transfer(int from, int to, double amount){
        if(accounts[from] < amount) return;

        bankLock.lock();
        try {
            System.out.printf(String.valueOf(Thread.currentThread()));
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
        }
        finally {
            bankLock.unlock();
        }


    }

    public double getTotalBalance(){
        double sum = 0;

        for(double a:accounts){
            sum += a;
        }

        return  sum;
    }

    public int size() {
        return accounts.length;
    }
}