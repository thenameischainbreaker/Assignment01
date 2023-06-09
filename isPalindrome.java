package Assignment01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class isPalindrome {

	public static void main(String[] args) {
		// Write a program in Java to check whether a number is Palindrome
		//or not using iteration.

	}


	public static boolean isPalindrome(String string) {
		char[] char_array = string.toCharArray();
		
		for(int i =0; i< char_array.length/2; i++) {
			
			if(char_array[i] != char_array[char_array.length-i-1]) {
				return false;
				
				
			}
			
			
		}
		
		return true;
		
		
		
		
	}
	
	 @Test
	    void testIsPalindrome() {
	        assertAll(
	            () -> assertTrue(isPalindrome.isPalindrome("radar"), "'radar' is a palindrome, expected output is true"),
	            () -> assertFalse(isPalindrome.isPalindrome("java"), "'java' is not a palindrome, expected output is false"),
	            () -> assertTrue(isPalindrome.isPalindrome("madam"), "'madam' is a palindrome, expected output is true"),
	            () -> assertFalse(isPalindrome.isPalindrome("openai"), "'openai' is not a palindrome, expected output is false"),
	            () -> assertTrue(isPalindrome.isPalindrome("abcba"), "'abcba' is a palindrome, expected output is true"),
	            () -> assertFalse(isPalindrome.isPalindrome("abcdef"), "'abcdef' is not a palindrome, expected output is false")
	        );
	    }




}
