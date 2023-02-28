package ar;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class bankaccount {
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {
       SimpleBankAcc user = new SimpleBankAcc();
       int option;
       Scanner sc = null;
       try{ 
       do{
            LOGGER.log(Level.INFO,"1. Deposit\n2. Withdrawal\n3. Check balance\n4. Cancel");
            LOGGER.log(Level.INFO,"Select Option: ");
            sc = new Scanner(System.in);
            option = sc.nextInt();
            if(option <4 || option >4){
            switch (option){
                case 1: user.deposit();
                break;
                case 2: user.withdrawal();
                break;
                case 3: user.checkBalance();
                break;
                default:
                LOGGER.log(Level.WARNING, "Invalid");
                break;
                }
            }
        }while(option!=4);
        LOGGER.log(Level.INFO,"Thank you for banking with us!");
        }finally{
            if(sc !=null){
                sc.close();
            }
        }
    }  
}
