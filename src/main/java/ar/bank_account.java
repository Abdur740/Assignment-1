package ar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

class SimpleBankAcc{
    Scanner sc = new Scanner(System.in);
    String userName;
    long accNumber;
    double balance;

    simpleBankAcc(){
        System.out.print("Enter user name: ");
        userName = sc.nextLine();
        System.out.print("Enter account number: ");
        accNumber = sc.nextLong();
    }
    void deposit(){
        System.out.print("Enter the amount to deposit: ");
        double amt = sc.nextDouble();
        System.out.print("Amount credited: " +amt);
        balance += amt;
    }
    void withdrawal(){
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmt = sc.nextDouble();
        if(withdrawAmt < balance){
            balance-=withdrawAmt;
        }
        else
        {
            System.out.println("Insufficient funds, try again.");
        }
    }
    void checkBalance(){
        System.out.println("Your balance is "+balance);
    }
}
public class BANKACCOUNT {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {
       simpleBankAcc user = new simpleBankAcc();
       int option;
       Scanner sc = null;
       try{ 
       do{
            System.out.println("1. Deposit\n2. Withdrawal\n3. Check balance\n4. Cancel");
            System.out.print("Select Option: ");
            
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
                LOGGER.log(Level.WARNING, "Invalid option!, Please select a valid option");
                }
            }
        }while(option!=4);
        System.out.println("Thank you for banking with us!");
        }finally{
            if(sc !=null){
                sc.close();
            }
        }
    }  
}
