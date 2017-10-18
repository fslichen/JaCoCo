package evolution;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
	@Test
	public void whenEmptyString_thenAccept() {
	    Palindrome palindromeTester = new Palindrome();
	    Assert.assertTrue(palindromeTester.isPalindrome(""));
	}
}
