import junit.framework.TestCase;
import org.junit.runner.JUnitCore;

public class MoneyTest extends TestCase {
    public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
  
  	public void testCurrency() {
       assertEquals("USD", Money.dollar(1).currency());
       assertEquals("CHF", Money.franc(1).currency());
    }
  
    public static void main(String[] args) throws Exception  {
		JUnitCore.main("MoneyTest");
    }
}
