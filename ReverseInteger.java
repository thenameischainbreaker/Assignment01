package Assignment01;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReverseInteger {


	
	
	public static int reverseInteger(int number) {
		int reverse = 0;
		int modulus;
		while(number / 10 != 0)  
			{
			modulus = number % 10;
			number = number / 10;
			reverse = modulus + reverse;
			reverse = reverse * 10;
			
			
			
			
			
		}
		
		return reverse + (number%10);
		
		
		
	}
	
	   @Test
	    void testReverseInteger() {
	        assertAll(
	            () -> assertEquals(54321, ReverseInteger.reverseInteger(12345), "Reversed integer of 12345 should be 54321"),
	            () -> assertEquals(1, ReverseInteger.reverseInteger(1), "Reversed integer of 1 should be 1"),
	            () -> assertEquals(876, ReverseInteger.reverseInteger(678), "Reversed integer of 678 should be 876"),
	            () -> assertEquals(0, ReverseInteger.reverseInteger(0), "Reversed integer of 0 should be 0"),
	            () -> assertEquals(987654321, ReverseInteger.reverseInteger(123456789), "Reversed integer of 123456789 should be 987654321")
	        );
	    }

}
