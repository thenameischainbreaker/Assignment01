package Assignment01;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CharacterCount {

	public static void main(String[] args) {
		// Write a program in Java to count occurence of a given character
		// in a String

	}
	
	
	
	
	public static int countCharacter(String s, char c) {
	// convert s to char array
		char[] array = s.toCharArray();
		int count = 0;
		for(char maybe : array) {
			if(maybe == c) {
				count++;
			}
			
			
		}
		
		return count;
		
	}
	
	 @Test
	    public void testCountCharacter() {
	        assertAll("All tests for countCharacter method",
	            () -> assertEquals(3, CharacterCount.countCharacter("abcabcabc", 'a'), "Count 'a' in 'abcabcabc'"),
	            () -> assertEquals(0, CharacterCount.countCharacter("abcabcabc", 'd'), "Count 'd' in 'abcabcabc'"),
	            () -> assertEquals(2, CharacterCount.countCharacter("hello", 'l'), "Count 'l' in 'hello'"),
	            () -> assertEquals(1, CharacterCount.countCharacter("OpenAI", 'O'), "Count 'O' in 'OpenAI'"),
	            () -> assertEquals(0, CharacterCount.countCharacter("", 'a'), "Count 'a' in an empty string"),
	            () -> assertEquals(0, CharacterCount.countCharacter("abcabcabc", '\0'), "Count null character in 'abcabcabc'")
	        );
	    }

}
