import java.util.Scanner;

class Account {

    public Account (double accountNumber, String accountHolderName, double accountBalance){

                    this.accountNumber = accountNumber;

                    this.accountHolderName = accountHolderName;

                    this.accountBalance = accountBalance;

    }

    public double accountNumber;

    public String accountHolderName;

    private double accountBalance;

    public void setBalance(double accountBalance) {

    this.accountBalance = accountBalance;

    }

    public double getBalance() {

        return accountBalance;

    }

}
class SavingsAccount extends Account {

     public SavingsAccount (double accountNumber, String accountHolderName, double accountBalance,double interestRate){

    super(accountNumber, accountHolderName, accountBalance);

    this.interestRate = interestRate;

    accountCreatedSavings++;

    }

    public double interestRate; 
    
    public static int accountCreatedSavings = 0;

}

class CurrentAccount extends Account {

     public CurrentAccount (double accountNumber, String accountHolderName, double accountBalance,double interestRate){

    super(accountNumber, accountHolderName, accountBalance);

    this.interestRate = interestRate;

    accountCreatedCurrent++;

    }

    public double interestRate; 
    
    public static int accountCreatedCurrent = 0;

}

class MainOfBankAccount {
public static void main (String [] args) {

      Scanner sc = new Scanner(System.in);
    
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

         }



      }
    
}

}