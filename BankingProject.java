import java.util.Scanner;

class Account {

    public double accountNumber;

    public String accountHolderName;

    public double accountBalance;

    public Account (double accountNumber, String accountHolderName, double accountBalance){

                    this.accountNumber = accountNumber;

                    this.accountHolderName = accountHolderName;

                    this.accountBalance = accountBalance;

    }

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

    public static SavingsAccount [] savingsAccounts = new SavingsAccount [2];

     public SavingsAccount (double accountNumber, String accountHolderName, double accountBalance,double interestRate){

    super(accountNumber, accountHolderName, accountBalance);

    this.interestRate = interestRate; 

    }

    public double amountWithInterest (double interestRate) {

          return accountBalance+(interestRate/100*accountBalance);

    }

}

class CurrentAccount extends Account {
    
    public static int accountCreatedCurrent = 0;

    public static CurrentAccount [] currentAccounts = new CurrentAccount[2];

     public CurrentAccount (double accountNumber, String accountHolderName, double accountBalance){

    super(accountNumber, accountHolderName, accountBalance);

    }

}

class MainOfBankAccount {
public static void main (String [] args) {

      Scanner sc = new Scanner(System.in);

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

             SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings] = new SavingsAccount(number, name, balance, interest);

             SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].accountNumber = number;

             SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].accountHolderName = name;

             SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].accountBalance = balance; 
             
            SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].interestRate = interest; 

             SavingsAccount.accountCreatedSavings++;

             if(SavingsAccount.accountCreatedSavings==2){

                System.out.println(" Number of the Savings Accounts created are : "+ SavingsAccount.accountCreatedSavings);

                System.out.println(" Savings Accounts Information : ");

             for(int i=0;i<2;i++){

                   System.out.println("Name  : "+SavingsAccount.savingsAccounts[i].accountHolderName);

                   System.out.println("Account Number  : "+SavingsAccount.savingsAccounts[i].accountNumber);

                   System.out.println("Savings Account Balance  : "+SavingsAccount.savingsAccounts[i].accountBalance);

                   System.out.print("Savings Account Balance Including the Interest  : ");

                   System.out.println(SavingsAccount.savingsAccounts[i].amountWithInterest (SavingsAccount.savingsAccounts[i].interestRate));
                   
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

             CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent] = new CurrentAccount(number, name, balance);

             CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent].accountNumber = number;

             CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent].accountHolderName = name;

             CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent].accountBalance = balance;

             CurrentAccount.accountCreatedCurrent++;

             if(CurrentAccount.accountCreatedCurrent==2){

                System.out.println(" Number of the Current account created are : "+ CurrentAccount.accountCreatedCurrent);

                System.out.println(" Current Accounts Information : ");

             for(int i=0;i<2;i++){

                   System.out.println("Name  : "+ CurrentAccount.currentAccounts[i].accountHolderName);

                   System.out.println("Account Number  : "+CurrentAccount.currentAccounts[i].accountNumber);

                   System.out.println("Current Account Balance  : "+CurrentAccount.currentAccounts[i].accountBalance);
                   
             }

            }

         }

         else {

              System.out.println("  You have an Invalid choice   ");

         }

      }

      } while (SavingsAccount.accountCreatedSavings!=2||CurrentAccount.accountCreatedCurrent!=2);

}

}