package Multi_Threading.Example1;

public class ThreadSynchronizationBankExample {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(0);

        // Create two threads that deposit money into the same account
        DepositThread thread1 = new DepositThread(account, 10);
        DepositThread thread2 = new DepositThread(account, 5);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Display the final balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
