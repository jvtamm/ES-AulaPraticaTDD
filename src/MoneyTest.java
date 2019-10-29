import junit.framework.TestCase;
import org.junit.runner.JUnitCore;

public class MoneyTest extends TestCase {

    public void testMultiplication() {
       Money five = new Money(5);
       five.times(2);
       assertEquals(10, five.amount);
    }
    public static void main(String[] args) throws Exception  {
      JUnitCore.main("MoneyTest");
    }
}