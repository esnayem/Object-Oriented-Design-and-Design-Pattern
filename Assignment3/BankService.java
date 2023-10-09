import java.util.Hashtable;
import java.math.BigDecimal;

public class BankService {
    private Hashtable<Integer, IAccount> bankAccounts;
    private int nextAccount;
    public BankService()
    {
        this.bankAccounts = new Hashtable<>();
        this.nextAccount = 0;
    }

    public int createNewAccount(String type, BigDecimal investAmount)
    {
        IAccount newAccount = null;
        nextAccount +=1;
        switch (type.toLowerCase())
        {
            case "chequing":
                newAccount = new Chequing(nextAccount, investAmount);
                break;
            case "saving":
                newAccount = new Saving(nextAccount, investAmount);
                break;
            case "investment":
                newAccount = new Investment(nextAccount, investAmount);
                break;
            default:
                System.out.println("Invaild Account type");
                break;
        }

        if(newAccount != null)
        {
            bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }

        return -1;
    }

    public void transferMoney(int to, int from, BigDecimal ammount)
    {
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);
        fromAccount.transfer(toAccount, ammount);
    }

    public void deposit(int accountNumber, BigDecimal ammount)
    {
        IAccount account = this.bankAccounts.get(accountNumber);
        account.deposit(ammount);
    }

    public void withDraw(int accountNumber, BigDecimal ammount)
    {
        IAccount account = this.bankAccounts.get(accountNumber);
        account.withdraw(ammount);
    }

    public BigDecimal showBalance(int accountNumber)
    {
        IAccount account = this.bankAccounts.get(accountNumber);
        BigDecimal currentBalance = account.showBalance();
        return currentBalance;
    }
}