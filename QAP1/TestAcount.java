package QAP1;

public class TestAcount {
    public static void main(String[] args) {
        // Create two accounts using parameterized constructor 
        Account acc1  = new Account(1, 5000);
        Account acc2 = new Account(2, 4000);

        // Display balance of both accounts 

    System.out.println("Initial balance of Account " + acc1.getAccountNumner() + ":$ " + acc1.getBalance());
    System.out.println("Initial balance of Account " + acc2.getAccountNumner() + ":$ " + acc2.getBalance());
   
    // Transfering $1000 from acc1 to acc2 
    
    if (acc1.transfer(acc2, 1000)) {
        System.out.println("Transefer successsful");
    } else {
        System.out.println("Transfer Failed");
    }

    System.out.println("Account " + acc1.getAccountNumner() + " New Balance: $" + acc1.getBalance());
    System.out.println("Account " + acc2.getAccountNumner() + " New Balance: $" + acc2.getBalance());





    }
}
