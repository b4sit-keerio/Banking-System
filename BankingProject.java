import java.util.Scanner;

class Account {

    public int accountCreated = 0;

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

    int [] savingAccounts = new int[1000];

}

class CurrentAccount extends Account {

    int [] currentAccounts = new int[1000];

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

    //   SavingsAccount savingsaccount = new SavingsAccount();

      Account ac = new Account();

      if(option == 1) {

         System.out.println("======Please tell me Which account you want to create======");
         
         System.out.println("1. Saving Account ");

         System.out.println("2. Current Account ");

         int optionForAccountCreation = sc.nextInt();

         sc.nextLine();

         if(optionForAccountCreation == 1) {

              System.out.println(" Please enter the name of the Account holder : ");

             

         }



      }
    
}

}