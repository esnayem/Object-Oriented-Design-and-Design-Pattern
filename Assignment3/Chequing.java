import java.math.BigDecimal;
public class Chequing implements IAccount{

    private int accountNumber;
    private BigDecimal balance;
    public Chequing(int accountNumber, BigDecimal investAmount)
    {
        this.accountNumber = accountNumber;
        this. balance = investAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        toAccount.deposit(amount);
        balance = balance.subtract(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal showBalance(){
        return  balance;
    }
}