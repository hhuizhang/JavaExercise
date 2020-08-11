/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package coreJava.concurrency.unsynch;

/**
 *
 * @author catherine
 * @version $Id: UnsynchBankTest.java, v 0.1 2019年05月01日 14:20 catherine Exp $
 */
public class UnsynchBankTest {

    public static final int NACCOUNT = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNT,INITIAL_BALANCE);
        for(int i = 0; i < NACCOUNT; i++){
            int fromAccount = i;
            Runnable r = () -> {
                try {
                while(true){
                    int toAccount = (int)(bank.size() * Math.random());
                    double amount = MAX_AMOUNT * Math.random();
                    bank.transfer(fromAccount,toAccount,amount);

                        Thread.sleep((int)(DELAY * Math.random()));
                    }
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            Thread t= new Thread(r);
            t.start();

        }
    }
}