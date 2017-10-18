package evolution;

public class AnyClass {
	public boolean anyMethod(String inputString) {
	    if (inputString.length() == 0) {
	        return true;
	    } else {
	        char firstChar = inputString.charAt(0);
	        char lastChar = inputString.charAt(inputString.length() - 1);
	        String mid = inputString.substring(1, inputString.length() - 1);
	        return (firstChar == lastChar) && anyMethod(mid);
	    }
	}
}
