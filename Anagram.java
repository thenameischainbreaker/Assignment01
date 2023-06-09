package Assignment01;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

//Write a program in Java to check if two String are Anagram
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isAnagram(String a, String b) {
		//convert a to char array
		char[] array_a = a.toCharArray();
		//convert b to char array
		char[] array_b = b.toCharArray();
		
		//sort both arrays
		Arrays.sort(array_a);
		Arrays.sort(array_b);
		
		//check if equal
		if(Arrays.equals(array_a, array_b)) {
			return true;
			}
		else {
			return false;
		}
	

}
	@Test
    public void testIsAnagram() {
        assertAll("All tests for isAnagram method",
            () -> assertTrue(Anagram.isAnagram("restful", "fluster"), "Anagram test for 'restful' and 'fluster'"),
            () -> assertFalse(Anagram.isAnagram("hello", "world"), "Anagram test for 'hello' and 'world'"),
            () -> assertTrue(Anagram.isAnagram("elbow", "below"), "Anagram test for 'elbow' and 'below'"),
            () -> assertTrue(Anagram.isAnagram("", ""), "Anagram test for two empty strings"),
            () -> assertFalse(Anagram.isAnagram("open", "ai"), "Anagram test for 'open' and 'ai'"),
            () -> assertTrue(Anagram.isAnagram("listen", "silent"), "Anagram test for 'listen' and 'silent'")
        );
    }
	
}
