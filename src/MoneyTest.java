import junit.framework.TestCase;
import org.junit.runner.JUnitCore;

public class MoneyTest extends TestCase {
    public void testEquality() {
       assertTrue(new Dollar(5).equals(new Dollar(5)));
       assertFalse(new Dollar(5).equals(new Dollar(6)));
       assertTrue(new Franc(5).equals(new Franc(5)));
       assertFalse(new Franc(5).equals(new Franc(6)));
    }
  
    public static void main(String[] args) throws Exception  {
		JUnitCore.main("MoneyTest");
    }
}