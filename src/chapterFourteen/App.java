package chapterFourteen;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        AccountE account = new AccountE();
        account.deposit(BigDecimal.valueOf(5000));
        try {
            account.withdrawal(BigDecimal.valueOf(10000));
        } catch (OleBalanceException e) {
            System.out.println(e.getMessage()


            );
            throw new RuntimeException(e);
        }
    }
}
