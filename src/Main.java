import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main {

    /**
     * In this test method we test if the "deposit" function works. The balance is set to "0" and the deposit amount
     * is set to "100". This should set the balance to 0 + 100 = 100.
     *
     * The first parameter in "assertEquals" is where we put the expected outcome which in this case is "100".
     * The second parameter gets the balance after the deposit and is compared to the first parameter.
     * If the parameters are equal the test will pass.
     *
     * @Param
     */
    @Test
    public void testDeposit() {
        Bank bank = new Bank(0, "123");
        bank.deposit(100);

        assertEquals(100, bank.getBalance());
    }

    /**
     * In this test method we test if the "withdrawal" function works. The bank object is initialized by setting
     * the balance and the accountNumber. If you set the balance to "0" and set the withdrawal amount to <0 the
     * test will return a "throw IllegalArgument" that tells you that the balance is too low. If you set the balance
     * to for an example "100" and the withdrawal amount to "50" (100-50) the test will pass.
     *
     * In the first parameter in "assertEquals" you set what the result of the withdrawal should be (100 - 50 = 50).
     * The second parameter gets the balance for the bank account after the withdrawal and compares it with the expected outcome.
     *
     * @param
     */
    @Test
    public void testWithdrawal() {
        Bank bank = new Bank(100, "234");

        bank.withdrawal(50); // 0 - 50 = -50 - won't pass

        assertEquals(50, bank.getBalance());
    }
}