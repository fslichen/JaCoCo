package evolution;
import org.junit.Assert;
import org.junit.Test;

public class AnyClassTest extends BaseTest {
	@Test
	public void testAnyMethod() {
	    AnyClass palindromeTester = new AnyClass();
	    Assert.assertTrue(palindromeTester.anyMethod(""));
	}
}
