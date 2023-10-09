import java.math.BigDecimal;

public class Investment implements IAccount{
    private int accountNumber;
    private BigDecimal balance;
    public Investment(int accountNumber, BigDecimal investAmount)
    {
        this.accountNumber = accountNumber;
        this. balance = investAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);

    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        toAccount.deposit(amount);
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public BigDecimal showBalance(){
        return  this.balance;
    }
}