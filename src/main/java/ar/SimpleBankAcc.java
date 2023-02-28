package ar;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class SimpleBankAcc{
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    Scanner sc = new Scanner(System.in);
    String userName;
    long accNumber;
    double balance;

    SimpleBankAcc(){
        LOGGER.log(Level.INFO,"Enter user name: ");
        userName = sc.nextLine();
        LOGGER.log(Level.INFO,"Enter account number: ");
        accNumber = sc.nextLong();
    }
    void deposit(){
        LOGGER.log(Level.INFO,"Enter amount to deposit: ");
        double amt = sc.nextDouble();
        LOGGER.log(Level.INFO,Double.toString(amt),"Amount credited: "+amt+" INR");
        balance += amt;
    }
    void withdrawal(){
        LOGGER.log(Level.INFO,"Enter amount to withdraw: ");
        double withdrawAmt = sc.nextDouble();
        if(withdrawAmt < balance){
            balance-=withdrawAmt;
            // LOGGER.log(Level.SEVERE,"Amount Withdrawed: "+withdrawAmt);
        }
        else
        {
            LOGGER.log(Level.INFO,"Insufficient funds, try again.");
        }
    }
    void checkBalance(){
        LOGGER.log(Level.INFO,"Your balance is "+balance+" INR");
    }
}
