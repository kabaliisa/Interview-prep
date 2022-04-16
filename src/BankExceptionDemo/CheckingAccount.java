package BankExceptionDemo;

public class CheckingAccount {
    private double balance;


    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public double withdraw (double amount) throws InsufficientFundsExceptions{
        if(amount > balance){
            throw new InsufficientFundsExceptions(amount);
        }
        return balance - amount;

    }

}
