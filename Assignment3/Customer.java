import java.math.BigDecimal;
import java.util.Scanner;
public class Customer {
    public static void main(String[] args) {
        
        System.out.println("Take action \"saving\", \"investment\", \"chequing\", \"deposit\", \"withdraw\", \"transfer\" ");
        String action;
        BigDecimal balance;
        Scanner scan = new Scanner(System.in);
        
        BankService bankService = new BankService();
        while(true)
        {
            int currentAccount = 1;
            int to = 2;

            System.out.println();
            System.out.print("Take action : ");
            action = scan.nextLine();

            if(action.equals("chequing"))
            {
                BigDecimal accountBlance = bankService.showBalance(currentAccount);
                BigDecimal investBalance = bankService.showBalance(to);
                System.out.println("Saving Account Balance = " + accountBlance);
                System.out.println("Invest Account Balance = " + investBalance);
                continue;
            }

            System.out.print("Balance = ");
            balance = scan.nextBigDecimal();
            scan.nextLine();
            System.out.println();

            if(action.equals("saving"))
            {
                int savingAccount = bankService.createNewAccount(action, balance);
                BigDecimal accountBalance = bankService.showBalance(savingAccount);
                System.out.println("The Saving Account Balance is " + accountBalance);
                currentAccount = savingAccount;
            }
            else if(action.equals("investment"))
            {
                int investAmount = bankService.createNewAccount(action, balance);
                BigDecimal investBalance = bankService.showBalance(investAmount);
                System.out.println("The Invest Account Balance is " +investBalance);
                to = investAmount;
            }
            else if(action.equals("deposit"))
            {
                bankService.deposit(currentAccount, balance);
                BigDecimal accountBalance = bankService.showBalance(currentAccount);
                System.out.println("The Saving Account Balance is " + accountBalance);
            }
            else if(action.equals("transfer"))
            {
                bankService.transferMoney(to, currentAccount, balance);
                BigDecimal accountBlance = bankService.showBalance(currentAccount);
                BigDecimal investBalance = bankService.showBalance(to);
                System.out.println("After Transfer Saving Account Balance = " + accountBlance);
                System.out.println("After Transfer Invest Account Balance = " + investBalance);
            }
            else if(action.equals("withdraw"))
            {
                bankService.withDraw(currentAccount, balance);
                BigDecimal accountBalance = bankService.showBalance(currentAccount);
                System.out.println("After Withdraw Saving Account Balance = " + accountBalance);
            }
            else
            {
                scan.close();
            }
        }
    }
}