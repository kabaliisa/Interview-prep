package BankExceptionDemo;

public class Main {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(200.00);
        try {
            account.withdraw(500.00);
        }catch (InsufficientFundsExceptions e){
            System.out.println("Insufficient amount" + " " +e.getAmount());
            e.printStackTrace();
        }
    }
}
