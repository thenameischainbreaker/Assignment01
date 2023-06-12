package Assignment01;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


//Java program to print the highest frequency character in a String;
public class HighestFrequencyCharinString {

	
	public static int count(String s) {
		char[] array = s.toCharArray();
		Arrays.sort(array);
		
		if (s.length() == 0)
			return 0;
	//	char previous = array[0];
		int max_count = 1;
		int current_count = 1;
		for(int i = 0; i<array.length-1; i++) {
			if(array[i+1]== array[i]) {
				current_count++;
			}
			else {
				if(current_count > max_count) {
				max_count = current_count;
				}
				current_count = 1;
			}
			
		}
		return max_count;
		
	}
	@Test
    void testCount() {
        assertAll("Test cases for HighestFrequencyCharinString.count()",
            () -> assertEquals(2, HighestFrequencyCharinString.count("hello")),
            () -> assertEquals(3, HighestFrequencyCharinString.count("success")),
            () -> assertEquals(2, HighestFrequencyCharinString.count("java")),
            () -> assertEquals(1, HighestFrequencyCharinString.count("openai")),
            () -> assertEquals(0, HighestFrequencyCharinString.count(""))
        );
    }
	
}
