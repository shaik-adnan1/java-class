package ses1;
import java.util.Scanner;

interface BankAccount {
    void deposit();

    void withdrawal();

    void getBalance(String name);
}

class SavingsAccount implements BankAccount {

    Scanner in = new Scanner(System.in);
    public double balance = in.nextDouble();

    public double returnBalance() {
        return this.balance;
    }

    @Override
    public void deposit() {
        System.out.println("Enter your Amout and D to deposit money into your account");
        Scanner in = new Scanner(System.in);
        double typeDeposit = in.nextDouble();
        System.out.println("Your Deposit Amount" + typeDeposit);

    }

    public void withdrawal() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your PIN and W to withdrawal money into your account");
        double typeWithdrawal = in.nextDouble();
        System.out.println("Your Withdraw Amount is: " + typeWithdrawal);
        if (balance < 1000) {
            System.out.println("You cannot withdraw money from your savings account");
        } else {
            System.out.println("You can withdraw money from your savings account");
        }
    }

    public void getBalance(String name) {
        Scanner in = new Scanner(System.in);
        double typeGetBalance = in.nextDouble();
        System.out.println("Enter your PIN and GB to see your current account balance" + typeGetBalance);
    }
}

class CurrentAccount implements BankAccount {
    Scanner in = new Scanner(System.in);
    double transactionAmt = in.nextDouble();
    double overdraftLimit = 5000;

    public SavingsAccount savingsAccount;

    // Constructor method

    // step 2 - Creaing a constructor and reading the savingsAccountObj object value
    // here
    public CurrentAccount(SavingsAccount savingsAccountObj) {
        System.out.println(savingsAccount);

        // step 3 - Assigining the Obj from SavingsAccount class to <savingsAccount>
        // variable
        this.savingsAccount = savingsAccountObj;
    }

    @Override
    public void deposit() {
        Scanner in = new Scanner(System.in);
        String depositOption = in.toString();
        System.out.println("Would you like to deposit money into your account: Yes or No?");
        if (depositOption == "Yes") {
            System.out.println("Let's proceed forward");
        } else {
            System.out.println("No problem, please return back to the main menu");
        }
    }

    public void withdrawal() {
        Scanner in = new Scanner(System.in);
        String withdrawOption = in.toString();
        System.out.println("Would you like to withdraw money into your account: Yes or No?");
        if (withdrawOption == "Yes") {
            System.out.println("Let's proceed forward");
        } else {
            System.out.println("No problem, please return back to the main menu");
        }
        System.out.println("You have withdrawn " + transactionAmt);
        if (transactionAmt < -overdraftLimit && transactionAmt > overdraftLimit) {
            System.out.println(
                    "Since you have passed the overdraft limit, you cannot withdraw money from your savings account");
        } else {
            double afterMoney = overdraftLimit - transactionAmt;
            System.out.println(
                    "Since you have not passed the overdraft limit, you can withdraw money from your savings account");
            System.out.println("You now have" + afterMoney + "in your account currently");
        }
    }

    public void getBalance(String name) {

        // step 4 - Reading the value from the assigned Object
        System.out.println("Your current account balance is " + savingsAccount.balance);
        System.out.println("name  is" + name);
    }
}

public class InterfacePracticeProblem3 {
    public static void main(String[] args) {
        SavingsAccount savingsAccountObj = new SavingsAccount();
        savingsAccountObj.deposit();
        savingsAccountObj.withdrawal();
        savingsAccountObj.getBalance("Adnan");

        // step 1 - passing the object as a parameter to CurrentAccount
        CurrentAccount myCurrentAccount = new CurrentAccount(savingsAccountObj);
        myCurrentAccount.deposit();
        myCurrentAccount.withdrawal();
        myCurrentAccount.getBalance("Saif");
    }
}
