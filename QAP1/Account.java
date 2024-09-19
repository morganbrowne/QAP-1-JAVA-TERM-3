package QAP1;

public class Account {
    private int accountNumber;
    private double balance; 


// Parameterized constructor to initialize account with a balance
public Account(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance; 
 }

 // Getter method for balance
 public double getBalance() {
    return balance;
 }

 // Get account number 

 public int getAccountNumner() {
    return accountNumber;
 }

 // Method to deposit money

 public void deposit (double ammount) {
    if (ammount > 0) {
        balance += ammount;
    } else {
        System.out.println("Deposit amount must be possitive");
    }
  }

// Method to withdraw money

public boolean withdraw (double amount) {
    if (amount > 0 && amount<= balance) {
        balance -= amount;
        return true;

    } else {
        System.out.println("Insuffiient balance or invalid amount");
        return false;
    }

}
 
// Method to transfer money from one account to another
 public boolean transfer(Account toAccount, double amount) {
    if (this.withdraw(amount)) {
        toAccount.deposit(amount);
        return true;
    }
    return false;
 }

}
