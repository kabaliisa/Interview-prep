package BankExceptionDemo;

public class InsufficientFundsExceptions extends Exception{
    private double amount;

    public InsufficientFundsExceptions(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
