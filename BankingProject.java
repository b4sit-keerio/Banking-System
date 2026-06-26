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

    int savingsAccountTransactions = 0;

    double [] accountsTransactionsSavings  = new double [100];

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

    int currentAccountTransactions = 0;

    public static CurrentAccount [] currentAccounts = new CurrentAccount[10];

    double [] accountsTransactionsCurrent  = new double [100];

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

      int accountNumberForTransactionHistory = -1;

      int accountTypeForTransactionHistory = -1;

      do { 
         
      System.out.println("====================================================");

      System.out.println("\t\tBANKING SYSTEM");

      System.out.println("====================================================");

      System.out.println("\tSecure | Fast | Reliable Banking");

      System.out.println("====================================================");

      System.out.println("1. Create an Account ");

      System.out.println("2. Deposit Money ");

      System.out.println("3. Withdraw money ");

      System.out.println("4. Check Balance ");

      System.out.println("5. Transaction History ");

      System.out.println("0. Exit  ");

      System.out.println("====================================================");
    
      System.out.println("CHOOSE AN OPTION : ");

      option = sc.nextInt();

      sc.nextLine();

      if(option == 1) {

         System.out.println("==========================================================");

         System.out.println("\tDEAR CUSTOMER YOU ARE CREATING AN ACCOUNT");

         System.out.println("==========================================================");

         System.out.println("==========================================================");

         System.out.println("\tDEAR CUSTOMER WHICH ACCOUNT YOU WANT TO CREATE");

         System.out.println("==========================================================");
         
         System.out.println("1. SAVINGS ACCOUNT ");

         System.out.println("2. CURRENT ACCOUNT ");

         System.out.println("CHOOSE AN OPTION : ");

         int optionForAccountCreation = sc.nextInt();

         sc.nextLine();

         if(optionForAccountCreation == 1) {

         System.out.println("==========================================================");

         System.out.println("\tDEAR CUSTOMER YOU ARE CREATING A SAVINGS ACCOUNT");

         System.out.println("==========================================================");

            System.out.println(" PLEASE ENTER THE NAME OF AN ACCOUNT HOLDER : ");

              name = sc.nextLine();

             System.out.println(" PLEASE ENTER AN ACCOUNT NUMBER : ");
 
              number = sc.nextDouble();

             sc.nextLine();

             System.out.println(" PLEASE ENTER THE INITIAL BALANCE WHICH YOU WANT TO DEPOSIT : ");

              balance = sc.nextDouble();

             sc.nextLine();

             System.out.println(" PLEASE ENTER THE INTEREST RATE FOR YOUR ACCOUNT : ");

              interest = sc.nextDouble();

             sc.nextLine();

             SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings] = new SavingsAccount(number, name, balance, interest);

             SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].accountNumber = number;

             SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].accountHolderName = name;

             SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].accountBalance = balance; 
             
            SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].interestRate = interest; 

            SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].accountBalance = SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].amountWithInterest (SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].interestRate);

            SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].accountsTransactionsSavings[SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].savingsAccountTransactions] = +balance;

            SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings].savingsAccountTransactions++;

            SavingsAccount.accountCreatedSavings++;

            System.out.println("+----------------------------------------------+");

            System.out.println("|          ACCOUNT CREATED SUCCESSFULLY        |");

            System.out.println("+----------------------------------------------+");

            System.out.println(" NAME  : "+SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings-1].accountHolderName);

            System.out.println(" ACCOUNT NUMBER : "+SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings-1].accountNumber);

            System.out.println(" ACCOUNT BALANCE : "+SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings-1].accountBalance);

            System.out.println(" ACCOUNT BALANCE INCLUDING INTEREST :"+SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings-1].accountBalance);

         }

         else if(optionForAccountCreation == 2) {

         System.out.println("==========================================================");

         System.out.println("\tDEAR CUSTOMER YOU ARE CREATING A CURRENT ACCOUNT");

         System.out.println("==========================================================");

            System.out.println(" PLEASE ENTER THE NAME OF AN ACCOUNT HOLDER : ");

              name = sc.nextLine();

             System.out.println(" PLEASE ENTER AN ACCOUNT NUMBER : ");
 
              number = sc.nextDouble();

             sc.nextLine();

             System.out.println(" PLEASE ENTER THE INITIAL BALANCE WHICH YOU WANT TO DEPOSIT : ");

              balance = sc.nextDouble();

             sc.nextLine();

             CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent] = new CurrentAccount(number, name, balance);

             CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent].accountNumber = number;

             CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent].accountHolderName = name;

             CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent].accountBalance = balance;

              CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent].accountsTransactionsCurrent[CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent].currentAccountTransactions] = +balance;

              CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent].currentAccountTransactions++;

             CurrentAccount.accountCreatedCurrent++;

            System.out.println("+----------------------------------------------+");

            System.out.println("|          ACCOUNT CREATED SUCCESSFULLY        |");

            System.out.println("+----------------------------------------------+");

            System.out.println(" NAME  : "+ CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent-1].accountHolderName);

            System.out.println(" ACCOUNT NUMBER  : "+CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent-1].accountNumber);

            System.out.println(" ACCOUNT BALANCE  : "+CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent-1].accountBalance);

         }

         else {

            System.out.println("+-------------------------------------------------+");

            System.out.println("|                INVALID CHOICE                   |");

            System.out.println("+-------------------------------------------------+");

         }

      }

      else if (option==2) {

         System.out.println("Please enter the Account Type for depositing an amount  ");

         System.out.println("1. Savings Account  ");
         
         System.out.println("2. Current Account  ");

         accountOptionForDeposit = sc.nextInt();

         if(accountOptionForDeposit==1) {

         System.out.println("Please enter the Amount you want to deposit in the Savings Account ");

         amountForDeposit = sc.nextDouble();

         sc.nextLine();

         System.out.println("Please enter the Account number for depositing an amount in the Savings Account ");

         accountNumberForDeposit = sc.nextDouble();

         sc.nextLine();

         for(int i=0;i<SavingsAccount.accountCreatedSavings;i++){

               if(accountNumberForDeposit==SavingsAccount.savingsAccounts[i].accountNumber) {

                   SavingsAccount.savingsAccounts[i].accountBalance = SavingsAccount.savingsAccounts[i].accountBalance+amountForDeposit;

                   SavingsAccount.savingsAccounts[i].accountsTransactionsSavings[SavingsAccount.savingsAccounts[i].savingsAccountTransactions] = +amountForDeposit;

                   SavingsAccount.savingsAccounts[i].savingsAccountTransactions++;

                   break;

               }

               else {

                  System.out.println(" Dear Customer you have entered a Wrong Account number ");

               }

         }

         System.out.println(" The New Balance is "+SavingsAccount.savingsAccounts[SavingsAccount.accountCreatedSavings-1].accountBalance);

         }

         else if(accountOptionForDeposit==2) {

         System.out.println("Please enter the Amount you want to deposit in the Current Account ");

         amountForDeposit = sc.nextDouble();

         sc.nextLine();

         System.out.println("Please enter the Account number for depositing an amount in the Current Account ");

         accountNumberForDeposit = sc.nextDouble();

         sc.nextLine();

         for(int i=0;i<CurrentAccount.accountCreatedCurrent;i++){

               if(accountNumberForDeposit==CurrentAccount.currentAccounts[i].accountNumber) {

                   CurrentAccount.currentAccounts[CurrentAccount.accountCreatedCurrent] = new CurrentAccount(number, name, balance);

                   CurrentAccount.currentAccounts[i].accountBalance =  CurrentAccount.currentAccounts[i].accountBalance+amountForDeposit;

                   CurrentAccount.currentAccounts[i].accountsTransactionsCurrent[CurrentAccount.currentAccounts[i].currentAccountTransactions] = +amountForDeposit;

                   CurrentAccount.currentAccounts[i].currentAccountTransactions++;

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

                   SavingsAccount.savingsAccounts[i].accountsTransactionsSavings[SavingsAccount.savingsAccounts[i].savingsAccountTransactions] = -amountForWithdraw;

                   SavingsAccount.savingsAccounts[i].savingsAccountTransactions++;

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

                   CurrentAccount.currentAccounts[i].accountsTransactionsCurrent[CurrentAccount.currentAccounts[i].currentAccountTransactions] = -amountForWithdraw;

                   CurrentAccount.currentAccounts[i].currentAccountTransactions++;

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

      else if (option == 5){
                
         System.out.println("Please enter your Account Number for checking your Account Transactions history ");

         accountNumberForTransactionHistory = sc.nextInt();

         sc.nextLine();

         System.out.println("Please enter your account type ");

         System.out.println(" 1. Savings Account ");

         System.out.println(" 2. Currrent Account ");

         accountTypeForTransactionHistory = sc.nextInt();

         sc.nextLine();

         if (accountTypeForTransactionHistory==1){

            for (int i = 0; i < SavingsAccount.accountCreatedSavings ; i++) {
         
                     if(accountNumberForTransactionHistory==SavingsAccount.savingsAccounts[i].accountNumber){

                          for(int k=0;k<=SavingsAccount.savingsAccounts[i].savingsAccountTransactions;k++){

                                  if(SavingsAccount.savingsAccounts[i].accountsTransactionsSavings[k]>0){

                                        System.out.println(" + "+ SavingsAccount.savingsAccounts[i].accountsTransactionsSavings[k]);

                  }

                    else if(SavingsAccount.savingsAccounts[i].accountsTransactionsSavings[k]<0)  {

                               System.out.println(" "+SavingsAccount.savingsAccounts[i].accountsTransactionsSavings[k]);

               }

            }

         }

      }

         }

         else if (accountTypeForTransactionHistory==2){

      for (int i = 0; i < CurrentAccount.accountCreatedCurrent ; i++) {
         
                     if(accountNumberForTransactionHistory==CurrentAccount.currentAccounts[i].accountNumber){

                          for(int k=0;k<=CurrentAccount.currentAccounts[i].currentAccountTransactions;k++){

                                  if(CurrentAccount.currentAccounts[i].accountsTransactionsCurrent[k]>0){

                                        System.out.println(" + "+CurrentAccount.currentAccounts[i].accountsTransactionsCurrent[k]);

                  }

                    else if(CurrentAccount.currentAccounts[i].accountsTransactionsCurrent[k]<0) {

                               System.out.println(" "+CurrentAccount.currentAccounts[i].accountsTransactionsCurrent[k]);

               }

         }

      }

      } 
      
   }
   
   }

}while (option!=0);

}

}
