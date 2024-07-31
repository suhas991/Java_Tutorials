package Multi_Threading.Example1;

public class BankAccount {

    private double balance;

    public BankAccount(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance(){
        return balance;
    }

    public synchronized void deposit(double amount){
        double newBal = balance + amount;

        try{
            Thread.sleep(10);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }

        balance = newBal;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double depositAmount;

    public DepositThread(BankAccount account,double depositAmount) {
        this.depositAmount = depositAmount;
        this.account = account;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            account.deposit(depositAmount);
        }

    }
}

