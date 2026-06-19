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

    public static SavingsAccount [] savingsAccounts = new SavingsAccount [10];

     public SavingsAccount (double accountNumber, String accountHolderName, double accountBalance,double interestRate){

    super(accountNumber, accountHolderName, accountBalance);

    this.interestRate = interestRate; 

    }

    public double amountWithInterest (double interestRate) {

          return (this.accountBalance+((interestRate/100)*this.accountBalance));

    }

}

class CurrentAccount extends Account {
    
    public static int accountCreatedCurrent = 0;

    public static CurrentAccount [] currentAccounts = new CurrentAccount[10];

     public CurrentAccount (double accountNumber, String accountHolderName, double accountBalance){

    super(accountNumber, accountHolderName, accountBalance);

    }

}

class MainOfBankAccount {
public static void main (String [] args) {

      Scanner sc = new Scanner(System.in);

      String name = null;

      double number = 0.0;

      double balance = 0.0;

      double interest = 0.0;

      double amountForDeposit = 0.0;

      double accountNumberForDeposit = 0.0;

      int accountOptionForDeposit = 0;

      double amountForWithdraw = 0.0;

      double accountNumberForWithdraw = 0.0;

      int accountOptionForWithdraw = 0;

      int option = -1;

      int accountNumberForAmountCheck = -1;

      do { 
    
      System.out.println("======Please select any option from the given menu======");

      System.out.println("1. Create an Account ");

      System.out.println("2. Deposit Money ");

      System.out.println("3. Withdraw money ");

      System.out.println("4. Check Balance ");

      System.out.println("5. Transaction History ");

      System.out.println("0. Exit  ");

      option = sc.nextInt();

      sc.nextLine();

      if(option == 1) {

         System.out.println("======Dear Customer you are creating an Account=====");

         System.out.println("======Please tell me Which account you want to create======");
         
         System.out.println("1. Saving Account ");

         System.out.println("2. Current Account ");

         int optionForAccountCreation = sc.nextInt();

         sc.nextLine();

         if(optionForAccountCreation == 1) {

            System.out.println("======Dear Customer you are creating a Savings Account=====");

            System.out.println(" Please enter the name of the Account holder : ");

              name = sc.nextLine();

             System.out.println(" Please enter the Account Number of the Account holder : ");
 
              number = sc.nextDouble();

             sc.nextLine();

             System.out.println(" Please enter the initial balance for the Account : ");

              balance = sc.nextDouble();

             sc.nextLine();

             System.out.println(" Please enter the interest rate for the Saving Account : ");

              interest = sc.nextDouble();

             sc.nextLine();

             SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings] = new SavingsAccount(number, name, balance, interest);

             SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].accountNumber = number;

             SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].accountHolderName = name;

             SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].accountBalance = balance; 
             
            SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].interestRate = interest; 

            SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].accountBalance = SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].amountWithInterest (SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].interestRate);

            SavingsAccount.accountCreatedSavings++;

             if(SavingsAccount.accountCreatedSavings==10){

                System.out.println(" Number of the Savings Accounts created are : "+ SavingsAccount.accountCreatedSavings);

                System.out.println(" Savings Accounts Information : ");

             for(int i=0;i<10;i++){

                   System.out.println("Name  : "+SavingsAccount.savingsAccounts[i].accountHolderName);

                   System.out.println("Account Number  : "+SavingsAccount.savingsAccounts[i].accountNumber);

                   System.out.println("Savings Account Balance  : "+SavingsAccount.savingsAccounts[i].accountBalance);

                   System.out.print("Savings Account Balance Including the Interest  : ");

                   System.out.println(SavingsAccount.savingsAccounts[i].accountBalance);
                   
             }

            }

            System.out.println("====== Dear Customer your Account has Created =====");

         }

         else if(optionForAccountCreation == 2) {

            System.out.println("======Dear Customer you are creating a Current Account=====");

            System.out.println(" Please enter the name of the Account holder : ");

              name = sc.nextLine();

             System.out.println(" Please enter the Account Number of the Account holder : ");
 
              number = sc.nextDouble();

             sc.nextLine();

             System.out.println(" Please enter the initial balance for the Account : ");

              balance = sc.nextDouble();

             sc.nextLine(); 

             CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent] = new CurrentAccount(number, name, balance);

             CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent].accountNumber = number;

             CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent].accountHolderName = name;

             CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent].accountBalance = balance;

             CurrentAccount.accountCreatedCurrent++;

             if(CurrentAccount.accountCreatedCurrent==10){

                System.out.println(" Number of the Current account created are : "+ CurrentAccount.accountCreatedCurrent);

                System.out.println(" Current Accounts Information : ");

             for(int i=0;i<10;i++){

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

      else if (option==2) {

         System.out.println("Please enter the Account Type for depositing an amount  ");

         System.out.println("1. Savings Account  ");
         
         System.out.println("2. Current Account  ");

         accountOptionForDeposit = sc.nextInt();

         if(accountOptionForDeposit==1) {

         System.out.println("Please enter the Amount you want to deposit  ");

         amountForDeposit = sc.nextDouble();

         sc.nextLine();

         System.out.println("Please enter the Account number for depositing an amount  ");

         accountNumberForDeposit = sc.nextDouble();

         sc.nextLine();

         for(int i=0;i<SavingsAccount.accountCreatedSavings;i++){

               if(accountNumberForDeposit==SavingsAccount.savingsAccounts[i].accountNumber) {

                   SavingsAccount.savingsAccounts[i].accountBalance = SavingsAccount.savingsAccounts[i].accountBalance+amountForDeposit;

                   break;

               }

               else {

                  System.out.println(" Dear Customer you have entered a Wrong Account number ");

               }

         }

         System.out.println(" The New Balance is "+SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings-1].accountBalance);

         }

         else if(accountOptionForDeposit==2) {

         System.out.println("Please enter the Amount you want to deposit  ");

         amountForDeposit = sc.nextDouble();

         sc.nextLine();

         System.out.println("Please enter the Account number for depositing an amount  ");

         accountNumberForDeposit = sc.nextDouble();

         sc.nextLine();

         for(int i=0;i<CurrentAccount.accountCreatedCurrent;i++){

               if(accountNumberForDeposit==CurrentAccount.currentAccounts[i].accountNumber) {

                   CurrentAccount.currentAccounts[i].accountBalance =  CurrentAccount.currentAccounts[i].accountBalance+amountForDeposit;

                   break;

               }

               else {

                  System.out.println(" Dear Customer you have entered a Wrong Account number ");

               }

         }

         System.out.println(" The New Balance is "+CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent-1].accountBalance);

         }

      }

      else if (option==3) {

         System.out.println("Please enter the Account Type for Withdraw an amount  ");

         System.out.println("1. Savings Account  ");
         
         System.out.println("2. Current Account  ");

         accountOptionForWithdraw = sc.nextInt();

         if(accountOptionForWithdraw==1) {

         System.out.println("Please enter the Amount you want to WithDraw  ");

         amountForWithdraw = sc.nextDouble();

         sc.nextLine();

         System.out.println("Please enter the Account number for Withdraw an amount  ");

         accountNumberForWithdraw = sc.nextDouble();

         sc.nextLine();

         for(int i=0;i<SavingsAccount.accountCreatedSavings;i++){

               if(accountNumberForWithdraw==SavingsAccount.savingsAccounts[i].accountNumber) {

                  if(SavingsAccount.savingsAccounts[i].accountBalance>=amountForWithdraw){

              SavingsAccount.savingsAccounts[i].accountBalance = SavingsAccount.savingsAccounts[i].accountBalance-amountForWithdraw;

                   break;

                  }

                  else {

                        System.out.println(" Dear Customer you are entering Wrong Amount for Withdraw ");

                        break;

                  }

               }

               else {

                    if(i==SavingsAccount.accountCreatedSavings-1){

                  System.out.println(" Dear Customer you have entered a Wrong Account number ");

                  break;

                  }

               }

         }

         System.out.println(" The New Balance is "+SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings-1].accountBalance);

         }

         else if(accountOptionForWithdraw==2) {

         System.out.println("Please enter the Amount you want to WithDraw  ");

         amountForWithdraw = sc.nextDouble();

         sc.nextLine();

         System.out.println("Please enter the Account number for Withdraw an amount  ");

         accountNumberForWithdraw = sc.nextDouble();

         sc.nextLine();

         for(int i=0;i<CurrentAccount.accountCreatedCurrent;i++){

               if(accountNumberForDeposit==CurrentAccount.currentAccounts[i].accountNumber) {

                  if(CurrentAccount.currentAccounts[i].accountBalance>=amountForWithdraw){
                     
               CurrentAccount.currentAccounts[i].accountBalance =  CurrentAccount.currentAccounts[i].accountBalance-amountForWithdraw;

                   break;

                  }

                  else {

                     System.out.println(" Dear Customer you are entering Wrong Amount for Withdraw ");

                     break;

                  }
                   
               }

               else {

                  if(i==CurrentAccount.accountCreatedCurrent-1){

                  System.out.println(" Dear Customer you have entered a Wrong Account number ");

                  break;

                  }

               }

         }

         System.out.println(" The New Balance is "+CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent-1].accountBalance);

         }

      }

      else if (option == 4) {

      System.out.println("Please enter your account Number for checking your Account balance ");

      accountNumberForAmountCheck = sc.nextInt();

      sc.nextLine();

      for (int i = 0; i < (SavingsAccount.accountCreatedSavings+CurrentAccount.accountCreatedCurrent); i++) {
         
         if(accountNumberForAmountCheck==SavingsAccount.savingsAccounts[i].accountNumber){

               System.out.println("Your Account Balance is : "+SavingsAccount.savingsAccounts[i].accountBalance);

               break;

         }

         else if(accountNumberForAmountCheck==CurrentAccount.currentAccounts[i].accountNumber){

               System.out.println("Your Account Balance is : "+CurrentAccount.currentAccounts[i].accountBalance);

               break;

         }

      }

      }

      } while (option!=0);

}

}