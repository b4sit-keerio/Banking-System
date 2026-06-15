import java.util.Scanner;

class Account {

    public Account (double accountNumber, String accountHolderName, double accountBalance){

                    this.accountNumber = accountNumber;

                    this.accountHolderName = accountHolderName;

                    this.accountBalance = accountBalance;

    }

    public double accountNumber;

    public String accountHolderName;

    public double accountBalance;

    public void setBalance(double accountBalance) {

    this.accountBalance = accountBalance;

    }

    public double getBalance() {

        return accountBalance;

    }

}
class SavingsAccount extends Account {

     public static int accountCreatedSavings = 0;

     public double interestRate; 

    public static SavingsAccount arrayofsavingaccounts [] = new SavingsAccount[2];

     public SavingsAccount (double accountNumber, String accountHolderName, double accountBalance,double interestRate){

    super(accountNumber, accountHolderName, accountBalance);

    this.interestRate = interestRate;
 
    arrayofsavingaccounts[accountCreatedSavings].accountHolderName = accountHolderName;

    arrayofsavingaccounts[accountCreatedSavings].accountNumber = accountNumber;

    arrayofsavingaccounts[accountCreatedSavings].accountBalance = accountBalance;

    arrayofsavingaccounts[accountCreatedSavings].interestRate = interestRate;

    accountCreatedSavings++;

    }

}

class CurrentAccount extends Account {

     public double interestRate; 
    
    public static int accountCreatedCurrent = 0;

     public CurrentAccount (double accountNumber, String accountHolderName, double accountBalance,double interestRate){

    super(accountNumber, accountHolderName, accountBalance);

    this.interestRate = interestRate;

    accountCreatedCurrent++;

    }

}

class MainOfBankAccount {
public static void main (String [] args) {

      Scanner sc = new Scanner(System.in);

    //   Account acc = new Account(0, null, 0)

      do { 
    
      System.out.println("======Please select any option from the given menu======");

      System.out.println("1. Create an Account ");

      System.out.println("2. Deposit Money ");

      System.out.println("3. Withdraw money ");

      System.out.println("4. Check Balance ");

      System.out.println("5. Transaction History ");

      int option = sc.nextInt();

      sc.nextLine();

      if(option == 1) {

         System.out.println("======Please tell me Which account you want to create======");
         
         System.out.println("1. Saving Account ");

         System.out.println("2. Current Account ");

         int optionForAccountCreation = sc.nextInt();

         sc.nextLine();

         if(optionForAccountCreation == 1) {

            System.out.println(" Please enter the name of the Account holder : ");

             String name = sc.nextLine();

             System.out.println(" Please enter the Account Number of the Account holder : ");
 
             double number = sc.nextInt();

             sc.nextLine();

             System.out.println(" Please enter the initial balance for the Account : ");

             double balance = sc.nextInt();

             sc.nextLine();

             System.out.println(" Please enter the interest rate for the Saving Account : ");

             double interest = sc.nextInt();

             sc.nextLine();

            SavingsAccount savingacc = new SavingsAccount(number, name, balance, interest);

             System.out.println(" Number of the saving account created are : "+ SavingsAccount.accountCreatedSavings);

             System.out.println(" Savings Account Information : ");

             if(SavingsAccount.accountCreatedSavings==2){

             for(int i=0;i<savingacc.arrayofsavingaccounts.length;i++){

                   System.out.println("Name "+savingacc.arrayofsavingaccounts[i].accountHolderName);

             }

            }

         }

         else if(optionForAccountCreation == 2) {

            System.out.println(" Please enter the name of the Account holder : ");

             String name = sc.nextLine();

             System.out.println(" Please enter the Account Number of the Account holder : ");
 
             double number = sc.nextInt();

             sc.nextLine();

             System.out.println(" Please enter the initial balance for the Account : ");

             double balance = sc.nextInt();

             sc.nextLine();

            //  System.out.println(" Please enter the interest rate for the Current Account : ");

            //  double interest = sc.nextInt();

            //  sc.nextLine();

             CurrentAccount currentacc = new CurrentAccount(number, name, balance, 0.0);

            //  System.out.println(" Number of the saving account created are : "+ SavingsAccount.accountCreatedSavings);

         }

         else {

              System.out.println("  You have an Invalid choice   ");

         }

      }

      } while (SavingsAccount.accountCreatedSavings!=3&&CurrentAccount.accountCreatedCurrent!=3);

}

}