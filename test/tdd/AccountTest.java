package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void depositTest(){
        //given
        Account joshuaAccount = new Account();

        //when i deposit 5000
        joshuaAccount.deposit(5000);

        //check that balance is 5000
        int joshuaAccountBalance = joshuaAccount.getBalance();

        assertEquals(5000, joshuaAccountBalance);
    }

    @Test
    public void depositTwiceTest(){
        //given there is an account
        Account joshuaAccount = new Account();
        //given that initial balance is 4000
        joshuaAccount.deposit(4000);
        //when i deposit 2000
        joshuaAccount.deposit(2000);
        //check that balance is 6000
        int joshuaAccountBalance = joshuaAccount.getBalance();
        assertEquals(6000, joshuaAccountBalance);

    }

    @Test
    public void depositNegativeAmount(){
        //given there is an account
        Account joshuaAccount = new Account();
        //given that initial balance is 4000
        joshuaAccount.deposit(4000);
        //when i deposit -2000
        joshuaAccount.deposit(-2000);
        //check that balance is 4000
        int joshuaAccountBalance = joshuaAccount.getBalance();
        assertEquals(4000, joshuaAccountBalance);


    }

    @Test
    public void WithdrawalTest() {
        //Given you have an account
        Account joshuaAccount = new Account();
    //Given that initial balance is 5000
        joshuaAccount.deposit(5000);
    //when i withdraw 3000
        joshuaAccount.withdraw(3000, "1234");
    //check balance
        int joshuaAccountBalance = joshuaAccount.getBalance();
        assertEquals(2000, 1234, joshuaAccountBalance);
    }

    @Test
    public void WithdrawalAboveBalanceTest() {
        //Given you have an account
        Account joshuaAccount = new Account();
        //Given that initial balance is 5000
        joshuaAccount.deposit(5000);
        //when i withdraw 6000
        joshuaAccount.withdraw(6000, "6543");
        //check balance
        int joshuaAccountBalance = joshuaAccount.getBalance();
        assertEquals(5000, 6543, joshuaAccountBalance);
    }
    @Test
    public void WithdrawalBelowBalanceTest() {
        //Given you have an account
        Account joshuaAccount = new Account();
        //Given that initial balance is 0
        joshuaAccount.deposit(6000);
        //when i withdraw 6000
        joshuaAccount.withdraw(6000, "1234");
        //check balance
        int joshuaAccountBalance = joshuaAccount.getBalance();
        assertEquals(0, 1234, joshuaAccountBalance);
    }
    @Test
    public void NegativeWithdrawalTest() {
        //Given you have an account
        Account joshuaAccount = new Account();
        //Given that initial balance is 0
        joshuaAccount.deposit(100);
        //when i withdraw 6000
        joshuaAccount.withdraw(-10000, "1234");
        //check balance
        int joshuaAccountBalance = joshuaAccount.getBalance();
        assertEquals(100, 1234, joshuaAccountBalance);
    }

    @Test
    public void Zero(){
        //Given that no account
        Account joshuaAccount = new Account();
        //initial deposit 5000
        joshuaAccount.deposit(5000);
        //when i withdraw 0
        joshuaAccount.withdraw(0, "1234");
       int joshuaAccountBalance = joshuaAccount.getBalance();
        //check balance
        assertEquals(5000, 1234, joshuaAccountBalance);

    }

    @Test
    public void WithdrawalWithPinTest() {
        //Given you have an account
        Account joshuaAccount = new Account();
        //Given that initial balance is 5000
        joshuaAccount.deposit(5000);
        //when i withdraw 6000
        joshuaAccount.withdraw(3000, "1234");

        //check balance
        int joshuaAccountBalance = joshuaAccount.getBalance();
        assertEquals(3000, 1234, joshuaAccountBalance);
    }
}
