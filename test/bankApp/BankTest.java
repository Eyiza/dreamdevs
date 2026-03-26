package bankApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private Bank bank;
    private ArrayList<Account> accounts;
    private String preciousAccount = "Precious";
    private String preciousPin = "1234";
    private String favourAccount = "Precious";
    private String favourPin = "6789";

    @BeforeEach
    public void setUp() {
        bank = new Bank("Moniepoint");
    }

    @Test
    public void newBank_has0Accounts() {
        assertEquals(0, bank.getAccounts().size());
        assertEquals("Moniepoint", bank.getName());
    }

    @Test
    public void create1Account_bankHas1Account() {
        assertEquals(0, bank.getAccounts().size());
        bank.createAccount(preciousAccount, preciousPin);
        assertEquals(1, bank.getAccounts().size());
    }

    @Test
    public void create2Account_bankHas2Account() {
        assertEquals(0, bank.getAccounts().size());
        bank.createAccount(preciousAccount, preciousPin);
        bank.createAccount(favourAccount, favourPin);
        assertEquals(2, bank.getAccounts().size());
    }
}
