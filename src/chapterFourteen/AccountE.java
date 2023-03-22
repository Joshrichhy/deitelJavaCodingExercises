package chapterFourteen;

import java.math.BigDecimal;

public class AccountE {
    private BigDecimal balance = BigDecimal.ZERO;
    public void deposit(BigDecimal amount){
        balance = balance.add(amount);
    }
    public void withdrawal(BigDecimal amount) throws OleBalanceException {
        if(balance.compareTo(amount) < 0) throw new OleBalanceException("Thief");
        balance = balance.subtract(amount);
    }
}
